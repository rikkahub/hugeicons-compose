package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = ImageVector.Builder(
            name = "Flame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 21.25f)
            curveTo(16.1421f, 21.25f, 19.5f, 17.8669f, 19.5f, 13.6935f)
            curveTo(19.5f, 12.8913f, 19.5f, 12.089f, 19.2756f, 11.0606f)
            curveTo(19.1017f, 10.2635f, 19.0147f, 9.86498f, 18.7651f, 9.64636f)
            curveTo(18.5475f, 9.45581f, 18.3598f, 9.38913f, 18.0717f, 9.39998f)
            curveTo(17.7412f, 9.41242f, 17.1956f, 9.85347f, 16.1046f, 10.7356f)
            curveTo(16.0227f, 10.8018f, 15.9817f, 10.8349f, 15.7137f, 10.8321f)
            curveTo(15.5671f, 10.8306f, 15.2736f, 10.7004f, 15.1735f, 10.5925f)
            curveTo(14.9905f, 10.3952f, 14.9807f, 10.2443f, 14.9611f, 9.94242f)
            curveTo(14.7677f, 6.95746f, 13.8802f, 5.00687f, 12.9275f, 3.77389f)
            curveTo(12.393f, 3.08206f, 12.1257f, 2.73615f, 11.6196f, 2.75042f)
            curveTo(11.1135f, 2.7647f, 10.7283f, 3.32541f, 9.9578f, 4.44682f)
            curveTo(8.04184f, 7.23538f, 4.5f, 8.84241f, 4.5f, 13.6935f)
            curveTo(4.5f, 17.8669f, 7.85786f, 21.25f, 12f, 21.25f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 17.432f)
            curveTo(16f, 19.5407f, 14.2091f, 21.2501f, 12f, 21.2501f)
            curveTo(9.79086f, 21.2501f, 8f, 19.5407f, 8f, 17.432f)
            curveTo(8f, 16.3392f, 9.07446f, 14.8337f, 10.1096f, 13.6368f)
            curveTo(10.9149f, 12.7058f, 11.3175f, 12.2402f, 12f, 12.2402f)
            curveTo(12.6825f, 12.2402f, 13.0851f, 12.7058f, 13.8904f, 13.6368f)
            curveTo(14.9255f, 14.8337f, 16f, 16.3392f, 16f, 17.432f)
            close()
        }
        }.build()

        return _flame!!
    }

private var _flame: ImageVector? = null
