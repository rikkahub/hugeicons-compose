package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ComputerPhoneSync: ImageVector
    get() {
        if (_computerPhoneSync != null) {
            return _computerPhoneSync!!
        }
        _computerPhoneSync = ImageVector.Builder(
            name = "ComputerPhoneSync",
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
        moveTo(12f, 17f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 17f, 3.75736f, 17f, 2.87868f, 16.1213f)
        curveTo(2f, 15.2426f, 2f, 13.8284f, 2f, 11f)
        verticalLineTo(9f)
        curveTo(2f, 6.17157f, 2f, 4.75736f, 2.87868f, 3.87868f)
        curveTo(3.75736f, 3f, 5.17157f, 3f, 8f, 3f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 3f, 20.2426f, 3f, 21.1213f, 3.87868f)
        curveTo(21.9466f, 4.70398f, 21.9968f, 6.00173f, 21.9998f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 14f)
        verticalLineTo(18f)
        curveTo(16f, 19.4142f, 16f, 20.1213f, 16.4393f, 20.5607f)
        curveTo(16.8787f, 21f, 17.5858f, 21f, 19f, 21f)
        curveTo(20.4142f, 21f, 21.1213f, 21f, 21.5607f, 20.5607f)
        curveTo(22f, 20.1213f, 22f, 19.4142f, 22f, 18f)
        verticalLineTo(14f)
        curveTo(22f, 12.5858f, 22f, 11.8787f, 21.5607f, 11.4393f)
        curveTo(21.1213f, 11f, 20.4142f, 11f, 19f, 11f)
        curveTo(17.5858f, 11f, 16.8787f, 11f, 16.4393f, 11.4393f)
        curveTo(16f, 11.8787f, 16f, 12.5858f, 16f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 21f)
        horizontalLineTo(8f)
        moveTo(10f, 21f)
        curveTo(10.8284f, 21f, 11.5f, 20.3284f, 11.5f, 19.5f)
        verticalLineTo(17f)
        lineTo(12f, 17f)
        moveTo(10f, 21f)
        horizontalLineTo(12.5f)
        verticalLineTo(17f)
        lineTo(12f, 17f)
        moveTo(12f, 17f)
        verticalLineTo(21f)
        }
        }.build()

        return _computerPhoneSync!!
    }

private var _computerPhoneSync: ImageVector? = null
