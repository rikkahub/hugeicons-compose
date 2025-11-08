package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SendToMobile02: ImageVector
    get() {
        if (_sendToMobile02 != null) {
            return _sendToMobile02!!
        }
        _sendToMobile02 = ImageVector.Builder(
            name = "SendToMobile02",
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
        moveTo(17f, 6f)
        curveTo(16.9855f, 4.29344f, 16.8908f, 3.35264f, 16.2702f, 2.73223f)
        curveTo(15.5378f, 2f, 14.3591f, 2f, 12.0016f, 2f)
        horizontalLineTo(9.001f)
        curveTo(6.64351f, 2f, 5.46476f, 2f, 4.73238f, 2.73223f)
        curveTo(4f, 3.46447f, 4f, 4.64298f, 4f, 7f)
        verticalLineTo(17f)
        curveTo(4f, 19.357f, 4f, 20.5355f, 4.73238f, 21.2678f)
        curveTo(5.46476f, 22f, 6.64351f, 22f, 9.001f, 22f)
        horizontalLineTo(12.0016f)
        curveTo(14.3591f, 22f, 15.5378f, 22f, 16.2702f, 21.2678f)
        curveTo(16.8908f, 20.6473f, 16.9855f, 19.7065f, 17f, 17.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 2f)
        horizontalLineTo(8.5f)
        lineTo(9f, 3f)
        horizontalLineTo(12f)
        lineTo(12.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 12.0337f)
        horizontalLineTo(12f)
        moveTo(17f, 9f)
        curveTo(17f, 9f, 19.0371f, 10.6469f, 19.8208f, 11.5533f)
        curveTo(19.9468f, 11.6991f, 20.0064f, 11.8627f, 19.9995f, 12.0253f)
        curveTo(19.9933f, 12.1711f, 19.9337f, 12.3162f, 19.8207f, 12.4468f)
        curveTo(19.0368f, 13.3531f, 17f, 15f, 17f, 15f)
        }
        }.build()

        return _sendToMobile02!!
    }

private var _sendToMobile02: ImageVector? = null
