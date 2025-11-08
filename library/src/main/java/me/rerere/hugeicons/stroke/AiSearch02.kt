package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiSearch02: ImageVector
    get() {
        if (_aiSearch02 != null) {
            return _aiSearch02!!
        }
        _aiSearch02 = ImageVector.Builder(
            name = "AiSearch02",
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
        moveTo(16.0001f, 16.5f)
        lineTo(20f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 11.5f)
        curveTo(18f, 15.366f, 14.866f, 18.5f, 11f, 18.5f)
        curveTo(7.13401f, 18.5f, 4f, 15.366f, 4f, 11.5f)
        curveTo(4f, 7.63404f, 7.13401f, 4.50003f, 11f, 4.50003f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 3.50003f)
        lineTo(15.7579f, 4.19706f)
        curveTo(16.0961f, 5.11105f, 16.2652f, 5.56805f, 16.5986f, 5.90142f)
        curveTo(16.932f, 6.2348f, 17.389f, 6.4039f, 18.303f, 6.74211f)
        lineTo(19f, 7.00003f)
        lineTo(18.303f, 7.25795f)
        curveTo(17.389f, 7.59616f, 16.932f, 7.76527f, 16.5986f, 8.09864f)
        curveTo(16.2652f, 8.43201f, 16.0961f, 8.88901f, 15.7579f, 9.803f)
        lineTo(15.5f, 10.5f)
        lineTo(15.2421f, 9.803f)
        curveTo(14.9039f, 8.88901f, 14.7348f, 8.43201f, 14.4014f, 8.09864f)
        curveTo(14.068f, 7.76527f, 13.611f, 7.59616f, 12.697f, 7.25795f)
        lineTo(12f, 7.00003f)
        lineTo(12.697f, 6.74211f)
        curveTo(13.611f, 6.4039f, 14.068f, 6.2348f, 14.4014f, 5.90142f)
        curveTo(14.7348f, 5.56805f, 14.9039f, 5.11105f, 15.2421f, 4.19706f)
        lineTo(15.5f, 3.50003f)
        }
        }.build()

        return _aiSearch02!!
    }

private var _aiSearch02: ImageVector? = null
