package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ComputerEthernet: ImageVector
    get() {
        if (_computerEthernet != null) {
            return _computerEthernet!!
        }
        _computerEthernet = ImageVector.Builder(
            name = "ComputerEthernet",
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
        moveTo(14f, 21f)
        horizontalLineTo(16f)
        moveTo(14f, 21f)
        curveTo(13.1716f, 21f, 12.5f, 20.3284f, 12.5f, 19.5f)
        verticalLineTo(17f)
        lineTo(12f, 17f)
        moveTo(14f, 21f)
        horizontalLineTo(10f)
        moveTo(10f, 21f)
        horizontalLineTo(8f)
        moveTo(10f, 21f)
        curveTo(10.8284f, 21f, 11.5f, 20.3284f, 11.5f, 19.5f)
        verticalLineTo(17f)
        lineTo(12f, 17f)
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
        moveTo(14f, 3f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 3f, 3.75736f, 3f, 2.87868f, 3.87868f)
        curveTo(2f, 4.75736f, 2f, 6.17157f, 2f, 9f)
        verticalLineTo(11f)
        curveTo(2f, 13.8284f, 2f, 15.2426f, 2.87868f, 16.1213f)
        curveTo(3.75736f, 17f, 5.17157f, 17f, 8f, 17f)
        horizontalLineTo(16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 10f)
        horizontalLineTo(20f)
        curveTo(21.1046f, 10f, 22f, 9.10457f, 22f, 8f)
        verticalLineTo(5.5f)
        horizontalLineTo(17f)
        verticalLineTo(8f)
        curveTo(17f, 9.10457f, 17.8954f, 10f, 19f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 10f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 5.5f)
        horizontalLineTo(22f)
        verticalLineTo(3.5f)
        curveTo(22f, 3.22386f, 21.7761f, 3f, 21.5f, 3f)
        horizontalLineTo(17.5f)
        curveTo(17.2239f, 3f, 17f, 3.22386f, 17f, 3.5f)
        verticalLineTo(5.5f)
        }
        }.build()

        return _computerEthernet!!
    }

private var _computerEthernet: ImageVector? = null
