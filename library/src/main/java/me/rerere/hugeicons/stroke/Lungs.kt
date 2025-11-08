package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Lungs: ImageVector
    get() {
        if (_lungs != null) {
            return _lungs!!
        }
        _lungs = ImageVector.Builder(
            name = "Lungs",
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
        moveTo(7.97769f, 11f)
        curveTo(8.38875f, 11.2063f, 8.71501f, 11.5615f, 8.97397f, 11.9954f)
        moveTo(8.97397f, 11.9954f)
        curveTo(9.97037f, 13.665f, 9.97025f, 16.5f, 9.97025f, 16.5f)
        curveTo(9.97025f, 20f, 8.18605f, 21f, 5.98512f, 21f)
        curveTo(4.98884f, 21f, 2f, 20.5f, 2f, 16f)
        curveTo(2f, 9.5f, 5.48698f, 5f, 8.47583f, 5f)
        curveTo(10.8669f, 5f, 9.97174f, 10f, 8.97397f, 11.9954f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0216f, 11f)
        curveTo(15.6104f, 11.2063f, 15.2841f, 11.5615f, 15.0251f, 11.9954f)
        moveTo(15.0251f, 11.9954f)
        curveTo(14.0286f, 13.665f, 14.0287f, 16.5f, 14.0287f, 16.5f)
        curveTo(14.0287f, 20f, 15.8132f, 21f, 18.0144f, 21f)
        curveTo(19.0108f, 21f, 22f, 20.5f, 22f, 16f)
        curveTo(22f, 9.5f, 18.5126f, 5f, 15.5234f, 5f)
        curveTo(13.132f, 5f, 14.0301f, 10f, 15.0251f, 11.9954f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7f)
        lineTo(12f, 5.66667f)
        moveTo(12f, 5.66667f)
        lineTo(10f, 7f)
        moveTo(12f, 5.66667f)
        verticalLineTo(3f)
        }
        }.build()

        return _lungs!!
    }

private var _lungs: ImageVector? = null
