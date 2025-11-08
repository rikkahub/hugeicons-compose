package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PropertySearch: ImageVector
    get() {
        if (_propertySearch != null) {
            return _propertySearch!!
        }
        _propertySearch = ImageVector.Builder(
            name = "PropertySearch",
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
        moveTo(11.5f, 21f)
        curveTo(7.02166f, 21f, 4.78249f, 21f, 3.39124f, 19.6088f)
        curveTo(2f, 18.2175f, 2f, 15.9783f, 2f, 11.5f)
        curveTo(2f, 7.02166f, 2f, 4.78249f, 3.39124f, 3.39124f)
        curveTo(4.78249f, 2f, 7.02166f, 2f, 11.5f, 2f)
        curveTo(15.9783f, 2f, 18.2175f, 2f, 19.6088f, 3.39124f)
        curveTo(21f, 4.78249f, 21f, 7.02166f, 21f, 11.5f)
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
        horizontalLineTo(11f)
        moveTo(6f, 16f)
        horizontalLineTo(7f)
        moveTo(10f, 12f)
        horizontalLineTo(14f)
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
        moveTo(20.4f, 20.4f)
        lineTo(22f, 22f)
        moveTo(21.2f, 17.6f)
        curveTo(21.2f, 15.6118f, 19.5882f, 14f, 17.6f, 14f)
        curveTo(15.6118f, 14f, 14f, 15.6118f, 14f, 17.6f)
        curveTo(14f, 19.5882f, 15.6118f, 21.2f, 17.6f, 21.2f)
        curveTo(19.5882f, 21.2f, 21.2f, 19.5882f, 21.2f, 17.6f)
        }
        }.build()

        return _propertySearch!!
    }

private var _propertySearch: ImageVector? = null
