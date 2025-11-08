package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ComputerArrowUp: ImageVector
    get() {
        if (_computerArrowUp != null) {
            return _computerArrowUp!!
        }
        _computerArrowUp = ImageVector.Builder(
            name = "ComputerArrowUp",
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
        moveTo(16f, 3f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 3f, 3.75736f, 3f, 2.87868f, 3.87868f)
        curveTo(2f, 4.75736f, 2f, 6.17157f, 2f, 9f)
        verticalLineTo(11f)
        curveTo(2f, 13.8284f, 2f, 15.2426f, 2.87868f, 16.1213f)
        curveTo(3.75736f, 17f, 5.17157f, 17f, 8f, 17f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 17f, 20.2426f, 17f, 21.1213f, 16.1213f)
        curveTo(22f, 15.2426f, 22f, 13.8284f, 22f, 11f)
        verticalLineTo(9f)
        curveTo(22f, 6.17157f, 22f, 4.75736f, 21.1213f, 3.87868f)
        curveTo(20.2426f, 3f, 18.8284f, 3f, 16f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.25f, 21f)
        horizontalLineTo(16f)
        moveTo(14.25f, 21f)
        curveTo(13.4216f, 21f, 12.75f, 20.3284f, 12.75f, 19.5f)
        verticalLineTo(17f)
        horizontalLineTo(12f)
        moveTo(14.25f, 21f)
        horizontalLineTo(9.75f)
        moveTo(9.75f, 21f)
        horizontalLineTo(8f)
        moveTo(9.75f, 21f)
        curveTo(10.5784f, 21f, 11.25f, 20.3284f, 11.25f, 19.5f)
        verticalLineTo(17f)
        horizontalLineTo(12f)
        moveTo(12f, 17f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 9.99998f)
        curveTo(9f, 9.99998f, 11.2095f, 7.00001f, 12f, 7f)
        curveTo(12.7906f, 6.99999f, 15f, 10f, 15f, 10f)
        moveTo(12f, 7.5f)
        verticalLineTo(13f)
        }
        }.build()

        return _computerArrowUp!!
    }

private var _computerArrowUp: ImageVector? = null
