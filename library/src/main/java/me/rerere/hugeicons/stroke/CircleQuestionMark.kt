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

val HugeIcons.CircleQuestionMark: ImageVector
    get() {
        if (_circleQuestionMark != null) {
            return _circleQuestionMark!!
        }
        _circleQuestionMark = ImageVector.Builder(
            name = "CircleQuestionMark",
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
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
            moveTo(9.5f, 9.5f)
            curveTo(9.5f, 8.11929f, 10.6193f, 7f, 12f, 7f)
            curveTo(13.3807f, 7f, 14.5f, 8.11929f, 14.5f, 9.5f)
            curveTo(14.5f, 10.3569f, 14.0689f, 11.1131f, 13.4117f, 11.5636f)
            curveTo(12.7283f, 12.0319f, 12f, 12.6716f, 12f, 13.5f)
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
            moveTo(12.125f, 16.75f)
            horizontalLineTo(12f)
            moveTo(12.25f, 16.75f)
            curveTo(12.25f, 16.8881f, 12.1381f, 17f, 12f, 17f)
            curveTo(11.8619f, 17f, 11.75f, 16.8881f, 11.75f, 16.75f)
            curveTo(11.75f, 16.6119f, 11.8619f, 16.5f, 12f, 16.5f)
            curveTo(12.1381f, 16.5f, 12.25f, 16.6119f, 12.25f, 16.75f)
            close()
        }
        }.build()

        return _circleQuestionMark!!
    }

private var _circleQuestionMark: ImageVector? = null
