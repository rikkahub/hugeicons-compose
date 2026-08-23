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

val HugeIcons.ContactRound: ImageVector
    get() {
        if (_contactRound != null) {
            return _contactRound!!
        }
        _contactRound = ImageVector.Builder(
            name = "ContactRound",
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
            moveTo(13f, 4f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
            curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
            verticalLineTo(14f)
            curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
            curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8284f)
            curveTo(21f, 19.6569f, 21f, 17.7712f, 21f, 14f)
            verticalLineTo(12f)
            curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
            curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
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
            moveTo(14.5f, 14.5f)
            curveTo(14.5f, 15.8807f, 13.3807f, 17f, 12f, 17f)
            curveTo(10.6193f, 17f, 9.5f, 15.8807f, 9.5f, 14.5f)
            curveTo(9.5f, 13.1193f, 10.6193f, 12f, 12f, 12f)
            curveTo(13.3807f, 12f, 14.5f, 13.1193f, 14.5f, 14.5f)
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
            moveTo(7.02441f, 21.5f)
            curveTo(7.27528f, 18.9733f, 9.40705f, 17f, 11.9997f, 17f)
            curveTo(14.5924f, 17f, 16.7242f, 18.9733f, 16.975f, 21.5f)
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
            moveTo(8f, 4f)
            verticalLineTo(2f)
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
            moveTo(16f, 4f)
            verticalLineTo(2f)
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
            moveTo(8f, 8f)
            horizontalLineTo(16f)
        }
        }.build()

        return _contactRound!!
    }

private var _contactRound: ImageVector? = null
