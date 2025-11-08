package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Saturn02: ImageVector
    get() {
        if (_saturn02 != null) {
            return _saturn02!!
        }
        _saturn02 = ImageVector.Builder(
            name = "Saturn02",
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
        moveTo(22f, 8.5f)
        curveTo(22f, 9.88071f, 20.8807f, 11f, 19.5f, 11f)
        curveTo(18.1193f, 11f, 17f, 9.88071f, 17f, 8.5f)
        curveTo(17f, 7.11929f, 18.1193f, 6f, 19.5f, 6f)
        curveTo(20.8807f, 6f, 22f, 7.11929f, 22f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.63604f, 18.364f)
        curveTo(4.00736f, 16.7353f, 3f, 14.4853f, 3f, 12f)
        curveTo(3f, 7.02944f, 7.02944f, 3f, 12f, 3f)
        curveTo(13.6393f, 3f, 15.1762f, 3.43827f, 16.5f, 4.20404f)
        moveTo(8.5f, 20.2941f)
        curveTo(9.57589f, 20.7487f, 10.7586f, 21f, 12f, 21f)
        curveTo(16.9706f, 21f, 21f, 16.9706f, 21f, 12f)
        curveTo(21f, 11.5348f, 20.9647f, 11.0778f, 20.8966f, 10.6315f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.1733f, 6.37998f)
        curveTo(22.0683f, 4.52002f, 22.2767f, 3.07282f, 21.6005f, 2.39789f)
        curveTo(20.7268f, 1.52568f, 18.5637f, 2.13056f, 15.8873f, 3.78543f)
        moveTo(18.3049f, 10.8298f)
        curveTo(17.2978f, 12.1187f, 16.1137f, 13.4588f, 14.7889f, 14.7838f)
        curveTo(9.48663f, 20.0868f, 3.93971f, 23.1394f, 2.39946f, 21.6018f)
        curveTo(1.52229f, 20.7262f, 2.13378f, 18.5507f, 3.8022f, 15.8604f)
        }
        }.build()

        return _saturn02!!
    }

private var _saturn02: ImageVector? = null
