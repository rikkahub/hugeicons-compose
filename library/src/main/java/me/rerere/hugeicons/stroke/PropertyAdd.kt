package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PropertyAdd: ImageVector
    get() {
        if (_propertyAdd != null) {
            return _propertyAdd!!
        }
        _propertyAdd = ImageVector.Builder(
            name = "PropertyAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.9977f, 12.5f)
        curveTo(20.9977f, 12.5f, 21f, 12f, 21f, 11.5f)
        curveTo(21f, 7.02166f, 21f, 4.78249f, 19.6088f, 3.39124f)
        curveTo(18.2175f, 2f, 15.9783f, 2f, 11.5f, 2f)
        curveTo(7.02166f, 2f, 4.78249f, 2f, 3.39124f, 3.39124f)
        curveTo(2f, 4.78249f, 2f, 7.02166f, 2f, 11.5f)
        curveTo(2f, 15.9783f, 2f, 18.2175f, 3.39124f, 19.6088f)
        curveTo(4.78249f, 21f, 7.02166f, 21f, 11.5f, 21f)
        curveTo(12.0307f, 21f, 12.5f, 20.9977f, 12.5f, 20.9977f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        horizontalLineTo(11.5f)
        moveTo(6f, 16f)
        horizontalLineTo(7f)
        moveTo(10f, 12f)
        horizontalLineTo(16f)
        moveTo(6f, 12f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 18.5f)
        horizontalLineTo(22f)
        moveTo(18.5f, 22f)
        lineTo(18.5f, 15f)
        }
        }.build()

        return _propertyAdd!!
    }

private var _propertyAdd: ImageVector? = null
