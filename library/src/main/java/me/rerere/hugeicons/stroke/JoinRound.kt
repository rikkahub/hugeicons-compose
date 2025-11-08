package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.JoinRound: ImageVector
    get() {
        if (_joinRound != null) {
            return _joinRound!!
        }
        _joinRound = ImageVector.Builder(
            name = "JoinRound",
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
        moveTo(15.9997f, 22f)
        horizontalLineTo(17.9997f)
        curveTo(19.8853f, 22f, 20.8281f, 22f, 21.4139f, 21.4142f)
        curveTo(21.9997f, 20.8284f, 21.9997f, 19.8856f, 21.9997f, 18f)
        verticalLineTo(17f)
        curveTo(21.9997f, 15.1144f, 21.9997f, 14.1716f, 21.4139f, 13.5858f)
        curveTo(20.8281f, 13f, 19.8853f, 13f, 17.9997f, 13f)
        lineTo(14.9997f, 13f)
        curveTo(13.114f, 13f, 12.1712f, 13f, 11.5855f, 12.4142f)
        curveTo(10.9997f, 11.8284f, 10.9997f, 10.8856f, 10.9997f, 9f)
        verticalLineTo(6f)
        curveTo(10.9997f, 4.11438f, 10.9997f, 3.17157f, 10.4139f, 2.58579f)
        curveTo(9.82809f, 2f, 8.88528f, 2f, 6.99966f, 2f)
        lineTo(5.99966f, 2f)
        curveTo(4.11405f, 2f, 3.17124f, 2f, 2.58545f, 2.58579f)
        curveTo(1.99966f, 3.17157f, 1.99966f, 4.11438f, 1.99966f, 6f)
        lineTo(1.99966f, 8f)
        curveTo(1.99966f, 14.5997f, 1.99967f, 17.8995f, 4.04992f, 19.9497f)
        curveTo(6.10017f, 22f, 9.4f, 22f, 15.9997f, 22f)
        }
        }.build()

        return _joinRound!!
    }

private var _joinRound: ImageVector? = null
