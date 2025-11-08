package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Clubs02: ImageVector
    get() {
        if (_clubs02 != null) {
            return _clubs02!!
        }
        _clubs02 = ImageVector.Builder(
            name = "Clubs02",
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
        moveTo(12f, 2f)
        curveTo(9.79086f, 2f, 8f, 3.8529f, 8f, 6.13856f)
        curveTo(8f, 6.89237f, 8.19479f, 7.59911f, 8.53513f, 8.20784f)
        curveTo(5.9581f, 7.52158f, 3f, 9.51116f, 3f, 12.3464f)
        curveTo(3f, 15.5508f, 6.13941f, 17.0241f, 8.81012f, 16.3268f)
        curveTo(9.67373f, 16.1013f, 10.1055f, 15.9886f, 10.2279f, 16.1211f)
        curveTo(10.696f, 16.6279f, 9.34611f, 19.1578f, 9.10267f, 19.6578f)
        curveTo(8.64426f, 20.5995f, 8.41506f, 21.0703f, 8.59267f, 21.3642f)
        curveTo(9.01463f, 22.0625f, 14.8121f, 22.3493f, 15.4073f, 21.3642f)
        curveTo(15.5849f, 21.0703f, 15.3557f, 20.5995f, 14.8973f, 19.6578f)
        curveTo(14.6539f, 19.1578f, 13.304f, 16.6279f, 13.7721f, 16.1211f)
        curveTo(13.8945f, 15.9886f, 14.3263f, 16.1013f, 15.1899f, 16.3268f)
        curveTo(17.8488f, 17.021f, 21f, 15.5187f, 21f, 12.3464f)
        curveTo(21f, 9.53108f, 18.0333f, 7.52389f, 15.4649f, 8.20784f)
        curveTo(15.8052f, 7.59911f, 16f, 6.89237f, 16f, 6.13856f)
        curveTo(16f, 3.8529f, 14.2091f, 2f, 12f, 2f)
        }
        }.build()

        return _clubs02!!
    }

private var _clubs02: ImageVector? = null
