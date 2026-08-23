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

val HugeIcons.Archive03: ImageVector
    get() {
        if (_archive03 != null) {
            return _archive03!!
        }
        _archive03 = ImageVector.Builder(
            name = "Archive03",
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
            moveTo(21f, 7f)
            horizontalLineTo(3f)
            verticalLineTo(13f)
            curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
            curveTo(5.34315f, 21f, 7.22876f, 21f, 11f, 21f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 21f, 18.6569f, 21f, 19.8284f, 19.8284f)
            curveTo(21f, 18.6569f, 21f, 16.7712f, 21f, 13f)
            verticalLineTo(7f)
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
            moveTo(21f, 7f)
            horizontalLineTo(3f)
            lineTo(4.2f, 5.4f)
            curveTo(5.08328f, 4.22229f, 5.52492f, 3.63344f, 6.15836f, 3.31672f)
            curveTo(6.7918f, 3f, 7.52786f, 3f, 9f, 3f)
            horizontalLineTo(15f)
            curveTo(16.4721f, 3f, 17.2082f, 3f, 17.8416f, 3.31672f)
            curveTo(18.4751f, 3.63344f, 18.9167f, 4.22229f, 19.8f, 5.4f)
            lineTo(21f, 7f)
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
            moveTo(12f, 17f)
            lineTo(12f, 10.5f)
            moveTo(9f, 14.5f)
            curveTo(9.58984f, 15.1068f, 11.1597f, 17.5f, 12f, 17.5f)
            curveTo(12.8403f, 17.5f, 14.4102f, 15.1068f, 15f, 14.5f)
        }
        }.build()

        return _archive03!!
    }

private var _archive03: ImageVector? = null
