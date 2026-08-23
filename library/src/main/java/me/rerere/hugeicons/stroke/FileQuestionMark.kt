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

val HugeIcons.FileQuestionMark: ImageVector
    get() {
        if (_fileQuestionMark != null) {
            return _fileQuestionMark!!
        }
        _fileQuestionMark = ImageVector.Builder(
            name = "FileQuestionMark",
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
            moveTo(3.5f, 14.5f)
            curveTo(3.5f, 13.1193f, 4.6193f, 12f, 6f, 12f)
            curveTo(7.3807f, 12f, 8.5f, 13.1193f, 8.5f, 14.5f)
            curveTo(8.5f, 15.3569f, 8.06886f, 16.1131f, 7.41166f, 16.5636f)
            curveTo(6.72833f, 17.0319f, 6f, 17.6716f, 6f, 18.5f)
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
            moveTo(6.125f, 21.75f)
            horizontalLineTo(6f)
            moveTo(6.25f, 21.75f)
            curveTo(6.25f, 21.8881f, 6.13807f, 22f, 6f, 22f)
            curveTo(5.86193f, 22f, 5.75f, 21.8881f, 5.75f, 21.75f)
            curveTo(5.75f, 21.6119f, 5.86193f, 21.5f, 6f, 21.5f)
            curveTo(6.13807f, 21.5f, 6.25f, 21.6119f, 6.25f, 21.75f)
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
            moveTo(13.5f, 2.5f)
            verticalLineTo(3f)
            curveTo(13.5f, 5.82843f, 13.5f, 7.24264f, 14.3787f, 8.12132f)
            curveTo(15.2574f, 9f, 16.6716f, 9f, 19.5f, 9f)
            horizontalLineTo(20f)
            moveTo(4.50394f, 7.98123f)
            curveTo(4.52397f, 5.69117f, 4.64575f, 4.40752f, 5.38607f, 3.48933f)
            curveTo(5.56507f, 3.26731f, 5.76731f, 3.06508f, 5.98932f, 2.88607f)
            curveTo(7.0883f, 2f, 8.71081f, 2f, 11.9558f, 2f)
            curveTo(12.6614f, 2f, 13.0141f, 2f, 13.3372f, 2.11401f)
            curveTo(13.4044f, 2.13772f, 13.4702f, 2.165f, 13.5345f, 2.19575f)
            curveTo(13.8435f, 2.34355f, 14.093f, 2.593f, 14.5919f, 3.09188f)
            lineTo(19.3284f, 7.82843f)
            curveTo(19.9065f, 8.40649f, 20.1955f, 8.69552f, 20.3478f, 9.06306f)
            curveTo(20.5f, 9.4306f, 20.5f, 9.83935f, 20.5f, 10.6569f)
            verticalLineTo(14f)
            curveTo(20.5f, 17.7712f, 20.5f, 19.6569f, 19.3284f, 20.8284f)
            curveTo(18.1568f, 22f, 16.2712f, 22f, 12.5f, 22f)
            curveTo(11.7645f, 22f, 11.1007f, 22f, 10.5f, 21.9913f)
        }
        }.build()

        return _fileQuestionMark!!
    }

private var _fileQuestionMark: ImageVector? = null
