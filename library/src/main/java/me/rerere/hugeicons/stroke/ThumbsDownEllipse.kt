package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThumbsDownEllipse: ImageVector
    get() {
        if (_thumbsDownEllipse != null) {
            return _thumbsDownEllipse!!
        }
        _thumbsDownEllipse = ImageVector.Builder(
            name = "ThumbsDownEllipse",
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
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.1525f, 15.2136f)
        lineTo(12.975f, 14.6571f)
        curveTo(12.8295f, 14.201f, 12.7567f, 13.973f, 12.8127f, 13.793f)
        curveTo(12.8579f, 13.6473f, 12.9573f, 13.5217f, 13.0927f, 13.4391f)
        curveTo(13.26f, 13.3369f, 13.5131f, 13.3369f, 14.0194f, 13.3369f)
        horizontalLineTo(14.2887f)
        curveTo(16.0021f, 13.3369f, 16.8588f, 13.3369f, 17.2634f, 12.8447f)
        curveTo(17.3097f, 12.7884f, 17.3508f, 12.7286f, 17.3864f, 12.6659f)
        curveTo(17.6977f, 12.1168f, 17.3438f, 11.3773f, 16.636f, 9.89811f)
        curveTo(15.9865f, 8.54072f, 15.6617f, 7.86203f, 15.0587f, 7.46255f)
        curveTo(15.0003f, 7.42387f, 14.9403f, 7.3874f, 14.8789f, 7.3532f)
        curveTo(14.244f, 7f, 13.4574f, 7f, 11.8843f, 7f)
        horizontalLineTo(11.5431f)
        curveTo(9.63715f, 7f, 8.68419f, 7f, 8.09209f, 7.55681f)
        curveTo(7.5f, 8.11363f, 7.5f, 9.00981f, 7.5f, 10.8022f)
        verticalLineTo(11.4321f)
        curveTo(7.5f, 12.3741f, 7.5f, 12.845f, 7.67223f, 13.2761f)
        curveTo(7.84445f, 13.7071f, 8.17424f, 14.0616f, 8.8338f, 14.7705f)
        lineTo(11.5614f, 17.702f)
        curveTo(11.6298f, 17.7755f, 11.664f, 17.8123f, 11.6942f, 17.8378f)
        curveTo(11.9757f, 18.0755f, 12.4102f, 18.0488f, 12.6563f, 17.7785f)
        curveTo(12.6826f, 17.7495f, 12.7115f, 17.7089f, 12.7691f, 17.6276f)
        curveTo(12.8592f, 17.5004f, 12.9043f, 17.4369f, 12.9436f, 17.3739f)
        curveTo(13.2952f, 16.81f, 13.4016f, 16.1401f, 13.2405f, 15.5042f)
        curveTo(13.2225f, 15.4332f, 13.1992f, 15.3599f, 13.1525f, 15.2136f)
        }
        }.build()

        return _thumbsDownEllipse!!
    }

private var _thumbsDownEllipse: ImageVector? = null
