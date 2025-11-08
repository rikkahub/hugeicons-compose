package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LaptopProgramming: ImageVector
    get() {
        if (_laptopProgramming != null) {
            return _laptopProgramming!!
        }
        _laptopProgramming = ImageVector.Builder(
            name = "LaptopProgramming",
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
        moveTo(20f, 14.5f)
        verticalLineTo(6.5f)
        curveTo(20f, 4.61438f, 20f, 3.67157f, 19.4142f, 3.08579f)
        curveTo(18.8284f, 2.5f, 17.8856f, 2.5f, 16f, 2.5f)
        horizontalLineTo(8f)
        curveTo(6.11438f, 2.5f, 5.17157f, 2.5f, 4.58579f, 3.08579f)
        curveTo(4f, 3.67157f, 4f, 4.61438f, 4f, 6.5f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.49762f, 15.5154f)
        lineTo(4.01953f, 14.5f)
        horizontalLineTo(19.9518f)
        lineTo(20.5023f, 15.5154f)
        curveTo(21.9452f, 18.177f, 22.3046f, 19.5077f, 21.7561f, 20.5039f)
        curveTo(21.2077f, 21.5f, 19.7536f, 21.5f, 16.8454f, 21.5f)
        lineTo(7.15462f, 21.5f)
        curveTo(4.24642f, 21.5f, 2.79231f, 21.5f, 2.24387f, 20.5039f)
        curveTo(1.69543f, 19.5077f, 2.05474f, 18.177f, 3.49762f, 15.5154f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 7f)
        lineTo(16.4199f, 7.79289f)
        curveTo(16.8066f, 8.12623f, 17f, 8.29289f, 17f, 8.5f)
        curveTo(17f, 8.70711f, 16.8066f, 8.87377f, 16.4199f, 9.20711f)
        lineTo(15.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 7f)
        lineTo(7.58009f, 7.79289f)
        curveTo(7.19337f, 8.12623f, 7f, 8.29289f, 7f, 8.5f)
        curveTo(7f, 8.70711f, 7.19336f, 8.87377f, 7.58009f, 9.20711f)
        lineTo(8.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 6f)
        lineTo(11f, 11f)
        }
        }.build()

        return _laptopProgramming!!
    }

private var _laptopProgramming: ImageVector? = null
