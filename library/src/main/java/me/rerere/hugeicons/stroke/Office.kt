package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Office: ImageVector
    get() {
        if (_office != null) {
            return _office!!
        }
        _office = ImageVector.Builder(
            name = "Office",
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
        moveTo(14f, 22f)
        verticalLineTo(8f)
        curveTo(14f, 5.17157f, 14f, 3.75736f, 13.1213f, 2.87868f)
        curveTo(12.2426f, 2f, 10.8284f, 2f, 8f, 2f)
        curveTo(5.17157f, 2f, 3.75736f, 2f, 2.87868f, 2.87868f)
        curveTo(2f, 3.75736f, 2f, 5.17157f, 2f, 8f)
        verticalLineTo(16f)
        curveTo(2f, 18.8284f, 2f, 20.2426f, 2.87868f, 21.1213f)
        curveTo(3.75736f, 22f, 5.17157f, 22f, 8f, 22f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 11f)
        horizontalLineTo(5.5f)
        moveTo(10.5f, 11f)
        horizontalLineTo(9.5f)
        moveTo(6.5f, 7f)
        horizontalLineTo(5.5f)
        moveTo(6.5f, 15f)
        horizontalLineTo(5.5f)
        moveTo(10.5f, 7f)
        horizontalLineTo(9.5f)
        moveTo(10.5f, 15f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 15f)
        horizontalLineTo(17.5f)
        moveTo(18.5f, 11f)
        horizontalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8f)
        horizontalLineTo(14f)
        verticalLineTo(22f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 22f, 20.8284f, 22f, 21.4142f, 21.4142f)
        curveTo(22f, 20.8284f, 22f, 19.8856f, 22f, 18f)
        verticalLineTo(12f)
        curveTo(22f, 10.1144f, 22f, 9.17157f, 21.4142f, 8.58579f)
        curveTo(20.8284f, 8f, 19.8856f, 8f, 18f, 8f)
        }
        }.build()

        return _office!!
    }

private var _office: ImageVector? = null
