package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VoiceId: ImageVector
    get() {
        if (_voiceId != null) {
            return _voiceId!!
        }
        _voiceId = ImageVector.Builder(
            name = "VoiceId",
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
        moveTo(2.50003f, 8.18677f)
        curveTo(2.60409f, 6.08705f, 2.9154f, 4.77792f, 3.84667f, 3.84664f)
        curveTo(4.77795f, 2.91537f, 6.08708f, 2.60406f, 8.1868f, 2.5f)
        moveTo(21.5f, 8.18677f)
        curveTo(21.396f, 6.08705f, 21.0847f, 4.77792f, 20.1534f, 3.84664f)
        curveTo(19.2221f, 2.91537f, 17.913f, 2.60406f, 15.8133f, 2.5f)
        moveTo(15.8133f, 21.5f)
        curveTo(17.913f, 21.3959f, 19.2221f, 21.0846f, 20.1534f, 20.1534f)
        curveTo(21.0847f, 19.2221f, 21.396f, 17.9129f, 21.5f, 15.8132f)
        moveTo(8.18679f, 21.5f)
        curveTo(6.08708f, 21.3959f, 4.77795f, 21.0846f, 3.84667f, 20.1534f)
        curveTo(2.9154f, 19.2221f, 2.60409f, 17.9129f, 2.50003f, 15.8132f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(17f)
        moveTo(8.00006f, 9f)
        verticalLineTo(15f)
        moveTo(16.0001f, 15f)
        verticalLineTo(9f)
        }
        }.build()

        return _voiceId!!
    }

private var _voiceId: ImageVector? = null
