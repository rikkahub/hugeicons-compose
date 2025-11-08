package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Disability02: ImageVector
    get() {
        if (_disability02 != null) {
            return _disability02!!
        }
        _disability02 = ImageVector.Builder(
            name = "Disability02",
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
        moveTo(11.5f, 10f)
        lineTo(9.5f, 9f)
        lineTo(7f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 6f)
        curveTo(12.8954f, 6f, 12f, 5.10457f, 12f, 4f)
        curveTo(12f, 2.89543f, 12.8954f, 2f, 14f, 2f)
        curveTo(15.1046f, 2f, 16f, 2.89543f, 16f, 4f)
        curveTo(16f, 5.10457f, 15.1046f, 6f, 14f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 19.4826f)
        curveTo(14.3982f, 21.0072f, 12.6003f, 22f, 10.5696f, 22f)
        curveTo(7.21743f, 22f, 4.5f, 19.295f, 4.5f, 15.9582f)
        curveTo(4.5f, 15.0829f, 4.66357f, 14.251f, 5f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6493f, 8f)
        lineTo(11.8965f, 9.84615f)
        curveTo(11.1304f, 11.7248f, 10.7474f, 12.6641f, 11.1832f, 13.3321f)
        curveTo(11.619f, 14f, 12.6149f, 14f, 14.6067f, 14f)
        curveTo(15.3014f, 14f, 15.9714f, 13.8192f, 16.3579f, 14.4961f)
        lineTo(19.5f, 20f)
        }
        }.build()

        return _disability02!!
    }

private var _disability02: ImageVector? = null
