package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.QuillWrite02: ImageVector
    get() {
        if (_quillWrite02 != null) {
            return _quillWrite02!!
        }
        _quillWrite02 = ImageVector.Builder(
            name = "QuillWrite02",
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
        moveTo(10.5502f, 3f)
        curveTo(6.69782f, 3.00694f, 4.6805f, 3.10152f, 3.39128f, 4.39073f)
        curveTo(2f, 5.78202f, 2f, 8.02125f, 2f, 12.4997f)
        curveTo(2f, 16.9782f, 2f, 19.2174f, 3.39128f, 20.6087f)
        curveTo(4.78257f, 22f, 7.0218f, 22f, 11.5003f, 22f)
        curveTo(15.9787f, 22f, 18.218f, 22f, 19.6093f, 20.6087f)
        curveTo(20.8985f, 19.3195f, 20.9931f, 17.3022f, 21f, 13.4498f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0556f, 13f)
        curveTo(10.3322f, 3.86635f, 16.8023f, 1.27554f, 21.9805f, 2.16439f)
        curveTo(22.1896f, 5.19136f, 20.7085f, 6.32482f, 17.8879f, 6.84825f)
        curveTo(18.4326f, 7.41736f, 19.395f, 8.13354f, 19.2912f, 9.02879f)
        curveTo(19.2173f, 9.66586f, 18.7846f, 9.97843f, 17.9194f, 10.6036f)
        curveTo(16.0231f, 11.9736f, 13.8264f, 12.8375f, 11.0556f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 17f)
        curveTo(11f, 11.5f, 12.9604f, 9.63636f, 15f, 8f)
        }
        }.build()

        return _quillWrite02!!
    }

private var _quillWrite02: ImageVector? = null
