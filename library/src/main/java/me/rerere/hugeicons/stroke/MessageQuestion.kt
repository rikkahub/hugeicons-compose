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

val HugeIcons.MessageQuestion: ImageVector
    get() {
        if (_messageQuestion != null) {
            return _messageQuestion!!
        }
        _messageQuestion = ImageVector.Builder(
            name = "MessageQuestion",
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
            moveTo(12f, 20.5f)
            curveTo(19.1328f, 20.5f, 22f, 16.4706f, 22f, 11.5f)
            curveTo(22f, 6.52944f, 20.1328f, 2.5f, 12f, 2.5f)
            curveTo(4.13281f, 2.5f, 2f, 6.52944f, 2f, 11.5f)
            curveTo(2f, 13.5712f, 2.37034f, 15.4791f, 3.37161f, 17f)
            curveTo(4.63281f, 19f, 3.99253f, 20.8333f, 3f, 21.5f)
            curveTo(4.61547f, 21.5f, 5.70211f, 20.9858f, 6.39239f, 20.4766f)
            curveTo(6.88252f, 20.115f, 7.50688f, 19.9364f, 8.0984f, 20.0815f)
            curveTo(9.20689f, 20.3533f, 10.4991f, 20.5f, 12f, 20.5f)
            close()
        }

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
            moveTo(10f, 9f)
            curveTo(10f, 7.89543f, 10.8954f, 7f, 12f, 7f)
            curveTo(13.1046f, 7f, 14f, 7.89543f, 14f, 9f)
            curveTo(14f, 9.57777f, 13.755f, 10.0983f, 13.3632f, 10.4634f)
            curveTo(12.7572f, 11.0282f, 12f, 11.6716f, 12f, 12.5f)
            moveTo(12.125f, 15.75f)
            horizontalLineTo(12f)
            moveTo(12.25f, 15.75f)
            curveTo(12.25f, 15.8881f, 12.1381f, 16f, 12f, 16f)
            curveTo(11.8619f, 16f, 11.75f, 15.8881f, 11.75f, 15.75f)
            curveTo(11.75f, 15.6119f, 11.8619f, 15.5f, 12f, 15.5f)
            curveTo(12.1381f, 15.5f, 12.25f, 15.6119f, 12.25f, 15.75f)
            close()
        }
        }.build()

        return _messageQuestion!!
    }

private var _messageQuestion: ImageVector? = null
