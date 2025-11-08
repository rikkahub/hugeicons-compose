package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RecoveryMail: ImageVector
    get() {
        if (_recoveryMail != null) {
            return _recoveryMail!!
        }
        _recoveryMail = ImageVector.Builder(
            name = "RecoveryMail",
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
        moveTo(7f, 8f)
        lineTo(9.94202f, 9.73943f)
        curveTo(11.6572f, 10.7535f, 12.3428f, 10.7535f, 14.058f, 9.73943f)
        lineTo(17f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 10.0262f)
        curveTo(21.9346f, 6.95987f, 21.9019f, 5.42671f, 20.7698f, 4.29099f)
        curveTo(19.6378f, 3.15527f, 18.0623f, 3.11571f, 14.9114f, 3.03658f)
        curveTo(12.9693f, 2.98781f, 11.0464f, 2.98781f, 9.10442f, 3.03657f)
        curveTo(5.95344f, 3.11569f, 4.37796f, 3.15525f, 3.24593f, 4.29098f)
        curveTo(2.11391f, 5.4267f, 2.0812f, 6.95986f, 2.01578f, 10.0262f)
        curveTo(1.99474f, 11.0121f, 1.99474f, 11.9922f, 2.01578f, 12.9782f)
        curveTo(2.0812f, 16.0445f, 2.11392f, 17.5777f, 3.24594f, 18.7134f)
        curveTo(4.37796f, 19.8491f, 5.95345f, 19.8887f, 9.10443f, 19.9678f)
        curveTo(9.74025f, 19.9837f, 10.374f, 19.9945f, 11.0071f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.6632f, 15.9994f)
        curveTo(21.1015f, 14.8169f, 19.8962f, 13.9994f, 18.5f, 13.9994f)
        curveTo(16.567f, 13.9994f, 15f, 15.5664f, 15f, 17.4994f)
        curveTo(15f, 19.4323f, 16.567f, 20.9994f, 18.5f, 20.9994f)
        curveTo(20.0853f, 20.9994f, 21.5695f, 19.9454f, 22f, 18.5f)
        moveTo(21.6632f, 15.9994f)
        verticalLineTo(13.5f)
        moveTo(21.6632f, 15.9994f)
        lineTo(19.4277f, 16.1574f)
        }
        }.build()

        return _recoveryMail!!
    }

private var _recoveryMail: ImageVector? = null
