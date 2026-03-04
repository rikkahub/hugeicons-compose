package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailEdit01: ImageVector
    get() {
        if (_mailEdit01 != null) {
            return _mailEdit01!!
        }
        _mailEdit01 = ImageVector.Builder(
            name = "MailEdit01",
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
        moveTo(2f, 5.49994f)
        lineTo(8.91302f, 9.41691f)
        curveTo(11.4616f, 10.8609f, 12.5384f, 10.8609f, 15.087f, 9.41691f)
        lineTo(22f, 5.49994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9953f, 10.0283f)
        curveTo(21.9299f, 6.96108f, 21.8972f, 5.42743f, 20.7655f, 4.29135f)
        curveTo(19.6337f, 3.15526f, 18.0586f, 3.11568f, 14.9083f, 3.03653f)
        curveTo(12.9668f, 2.98775f, 11.0443f, 2.98774f, 9.10276f, 3.03652f)
        curveTo(5.95252f, 3.11567f, 4.3774f, 3.15524f, 3.24564f, 4.29133f)
        curveTo(2.11389f, 5.42742f, 2.08118f, 6.96107f, 2.01577f, 10.0283f)
        curveTo(1.99474f, 11.0146f, 1.99474f, 11.995f, 2.01577f, 12.9813f)
        curveTo(2.08119f, 16.0486f, 2.11389f, 17.5822f, 3.24565f, 18.7183f)
        curveTo(4.3774f, 19.8544f, 5.95252f, 19.894f, 9.10277f, 19.9731f)
        curveTo(9.57102f, 19.9849f, 10.0382f, 19.9938f, 10.5047f, 19.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.8522f, 13.4391f)
        lineTo(21.5446f, 14.1315f)
        curveTo(22.1304f, 14.7172f, 22.1304f, 15.667f, 21.5446f, 16.2528f)
        lineTo(17.9172f, 19.9484f)
        curveTo(17.6319f, 20.2338f, 17.2669f, 20.4262f, 16.8702f, 20.5002f)
        lineTo(14.622f, 20.9883f)
        curveTo(14.2671f, 21.0653f, 13.951f, 20.7502f, 14.027f, 20.395f)
        lineTo(14.5056f, 18.1597f)
        curveTo(14.5796f, 17.763f, 14.772f, 17.398f, 15.0574f, 17.1126f)
        lineTo(18.7309f, 13.4391f)
        curveTo(19.3167f, 12.8533f, 20.2665f, 12.8533f, 20.8522f, 13.4391f)
        }
        }.build()

        return _mailEdit01!!
    }

private var _mailEdit01: ImageVector? = null
