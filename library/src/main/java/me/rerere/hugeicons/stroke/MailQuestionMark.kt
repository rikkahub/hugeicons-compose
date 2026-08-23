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

val HugeIcons.MailQuestionMark: ImageVector
    get() {
        if (_mailQuestionMark != null) {
            return _mailQuestionMark!!
        }
        _mailQuestionMark = ImageVector.Builder(
            name = "MailQuestionMark",
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
            moveTo(2.50006f, 6f)
            lineTo(9.06743f, 9.91697f)
            curveTo(11.4886f, 11.361f, 12.5115f, 11.361f, 14.9327f, 9.91697f)
            lineTo(21.5001f, 6f)
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
            moveTo(18f, 15f)
            curveTo(18f, 13.8954f, 18.8954f, 13f, 20f, 13f)
            curveTo(21.1046f, 13f, 22f, 13.8954f, 22f, 15f)
            curveTo(22f, 15.7571f, 21.5793f, 16.4159f, 20.959f, 16.7555f)
            curveTo(20.4745f, 17.0207f, 20f, 17.4477f, 20f, 18f)
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
            moveTo(20.125f, 20.75f)
            horizontalLineTo(20f)
            moveTo(20.25f, 20.75f)
            curveTo(20.25f, 20.8881f, 20.1381f, 21f, 20f, 21f)
            curveTo(19.8619f, 21f, 19.75f, 20.8881f, 19.75f, 20.75f)
            curveTo(19.75f, 20.6119f, 19.8619f, 20.5f, 20f, 20.5f)
            curveTo(20.1381f, 20.5f, 20.25f, 20.6119f, 20.25f, 20.75f)
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
            moveTo(15.0001f, 18.9991f)
            curveTo(14.6823f, 19f, 14.3493f, 19f, 14.0001f, 19f)
            horizontalLineTo(10.0001f)
            curveTo(6.22882f, 19f, 4.34321f, 19f, 3.17163f, 17.8284f)
            curveTo(2.00006f, 16.6569f, 2.00006f, 14.7712f, 2.00006f, 11f)
            curveTo(2.00006f, 7.22876f, 2.00006f, 5.34315f, 3.17163f, 4.17157f)
            curveTo(4.34321f, 3f, 6.22882f, 3f, 10.0001f, 3f)
            horizontalLineTo(14.0001f)
            curveTo(17.7713f, 3f, 19.6569f, 3f, 20.8285f, 4.17157f)
            curveTo(21.8916f, 5.23467f, 21.99f, 6.8857f, 21.9991f, 10f)
        }
        }.build()

        return _mailQuestionMark!!
    }

private var _mailQuestionMark: ImageVector? = null
