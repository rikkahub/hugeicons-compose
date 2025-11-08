package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailAtSign02: ImageVector
    get() {
        if (_mailAtSign02 != null) {
            return _mailAtSign02!!
        }
        _mailAtSign02 = ImageVector.Builder(
            name = "MailAtSign02",
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
        moveTo(7f, 7.5f)
        lineTo(9.94202f, 9.23943f)
        curveTo(11.6572f, 10.2535f, 12.3428f, 10.2535f, 14.058f, 9.23943f)
        lineTo(17f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 19.5f)
        curveTo(10.0337f, 19.4939f, 9.56682f, 19.485f, 9.09883f, 19.4732f)
        curveTo(5.95033f, 19.3941f, 4.37608f, 19.3545f, 3.24496f, 18.2184f)
        curveTo(2.11383f, 17.0823f, 2.08114f, 15.5487f, 2.01577f, 12.4814f)
        curveTo(1.99475f, 11.4951f, 1.99474f, 10.5147f, 2.01576f, 9.52843f)
        curveTo(2.08114f, 6.46113f, 2.11382f, 4.92748f, 3.24495f, 3.79139f)
        curveTo(4.37608f, 2.6553f, 5.95033f, 2.61573f, 9.09882f, 2.53658f)
        curveTo(11.0393f, 2.4878f, 12.9607f, 2.48781f, 14.9012f, 2.53659f)
        curveTo(18.0497f, 2.61574f, 19.6239f, 2.65532f, 20.755f, 3.79141f)
        curveTo(21.8862f, 4.92749f, 21.9189f, 6.46114f, 21.9842f, 9.52844f)
        curveTo(21.9939f, 9.98251f, 21.9991f, 10.1965f, 21.9999f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 17f)
        curveTo(19f, 17.8284f, 18.3284f, 18.5f, 17.5f, 18.5f)
        curveTo(16.6716f, 18.5f, 16f, 17.8284f, 16f, 17f)
        curveTo(16f, 16.1716f, 16.6716f, 15.5f, 17.5f, 15.5f)
        curveTo(18.3284f, 15.5f, 19f, 16.1716f, 19f, 17f)
        moveTo(19f, 17f)
        verticalLineTo(17.5f)
        curveTo(19f, 18.3284f, 19.6716f, 19f, 20.5f, 19f)
        curveTo(21.3284f, 19f, 22f, 18.3284f, 22f, 17.5f)
        verticalLineTo(17f)
        curveTo(22f, 14.5147f, 19.9853f, 12.5f, 17.5f, 12.5f)
        curveTo(15.0147f, 12.5f, 13f, 14.5147f, 13f, 17f)
        curveTo(13f, 19.4853f, 15.0147f, 21.5f, 17.5f, 21.5f)
        }
        }.build()

        return _mailAtSign02!!
    }

private var _mailAtSign02: ImageVector? = null
