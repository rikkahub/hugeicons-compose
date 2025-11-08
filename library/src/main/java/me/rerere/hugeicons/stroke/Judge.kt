package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Judge: ImageVector
    get() {
        if (_judge != null) {
            return _judge!!
        }
        _judge = ImageVector.Builder(
            name = "Judge",
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
        moveTo(16.6582f, 13f)
        lineTo(19.4303f, 15.3806f)
        curveTo(20.0131f, 15.8811f, 20.3045f, 16.1313f, 20.5492f, 16.4136f)
        curveTo(20.9409f, 16.8655f, 21.2468f, 17.3808f, 21.4528f, 17.9356f)
        curveTo(21.5815f, 18.2821f, 21.658f, 18.6515f, 21.8109f, 19.3902f)
        curveTo(21.9648f, 20.1337f, 22f, 21.5f, 22f, 22f)
        moveTo(7.34236f, 13f)
        lineTo(4.57021f, 15.3806f)
        curveTo(3.98742f, 15.8811f, 3.69601f, 16.1313f, 3.45133f, 16.4136f)
        curveTo(3.05962f, 16.8655f, 2.75371f, 17.3808f, 2.54771f, 17.9356f)
        curveTo(2.41903f, 18.2821f, 2.34257f, 18.6515f, 2.18965f, 19.3902f)
        curveTo(2.03573f, 20.1337f, 2f, 21.5f, 2f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 11f)
        curveTo(16.5f, 13.7615f, 14.4853f, 16f, 12f, 16f)
        curveTo(9.51472f, 16f, 7.5f, 13.7614f, 7.5f, 11f)
        moveTo(16.5f, 11f)
        curveTo(16.5f, 8.94231f, 15.7173f, 6.40776f, 14f, 6.40776f)
        curveTo(13.2173f, 6.40776f, 13f, 7.49994f, 12f, 7.49994f)
        curveTo(11f, 7.49994f, 10.7825f, 6.40771f, 10f, 6.40771f)
        curveTo(8.28254f, 6.40771f, 7.50001f, 8.94218f, 7.5f, 11f)
        moveTo(16.5f, 11f)
        verticalLineTo(12f)
        curveTo(16.5f, 13.1046f, 17.3954f, 14f, 18.5f, 14f)
        curveTo(19.6046f, 14f, 20.5f, 13.1046f, 20.5f, 12f)
        curveTo(20.5f, 11.3276f, 20.1681f, 10.7326f, 19.6592f, 10.37f)
        curveTo(20.175f, 9.91208f, 20.5f, 9.24399f, 20.5f, 8.5f)
        curveTo(20.5f, 7.11929f, 19.3807f, 6f, 18f, 6f)
        curveTo(18f, 3.79086f, 15.5f, 2f, 12f, 2f)
        curveTo(8.5f, 2f, 6f, 3.79086f, 6f, 6f)
        curveTo(4.61929f, 6f, 3.5f, 7.11929f, 3.5f, 8.5f)
        curveTo(3.5f, 9.24399f, 3.82499f, 9.91208f, 4.34075f, 10.37f)
        curveTo(3.83187f, 10.7326f, 3.5f, 11.3276f, 3.5f, 12f)
        curveTo(3.5f, 13.1046f, 4.39543f, 14f, 5.5f, 14f)
        curveTo(6.60457f, 14f, 7.5f, 13.1046f, 7.5f, 12f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0291f, 16f)
        lineTo(15.168f, 19.3675f)
        curveTo(15.8775f, 21.4655f, 15.5443f, 22f, 13.243f, 22f)
        horizontalLineTo(10.757f)
        curveTo(8.45571f, 22f, 8.12254f, 21.4655f, 8.83205f, 19.3675f)
        lineTo(9.9709f, 16f)
        }
        }.build()

        return _judge!!
    }

private var _judge: ImageVector? = null
