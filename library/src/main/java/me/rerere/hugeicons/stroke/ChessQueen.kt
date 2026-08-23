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

val HugeIcons.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) {
            return _chessQueen!!
        }
        _chessQueen = ImageVector.Builder(
            name = "ChessQueen",
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
            moveTo(15.5f, 9f)
            lineTo(17f, 18f)
            horizontalLineTo(7f)
            lineTo(8.5f, 9f)
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
            moveTo(17f, 22f)
            horizontalLineTo(7f)
            curveTo(6.53501f, 22f, 6.30252f, 22f, 6.11177f, 21.9489f)
            curveTo(5.59413f, 21.8102f, 5.18981f, 21.4059f, 5.05111f, 20.8882f)
            curveTo(5f, 20.6975f, 5f, 20.465f, 5f, 20f)
            curveTo(5f, 18.8954f, 5.89543f, 18f, 7f, 18f)
            horizontalLineTo(17f)
            curveTo(18.1046f, 18f, 19f, 18.8954f, 19f, 20f)
            curveTo(19f, 20.465f, 19f, 20.6975f, 18.9489f, 20.8882f)
            curveTo(18.8102f, 21.4059f, 18.4059f, 21.8102f, 17.8882f, 21.9489f)
            curveTo(17.6975f, 22f, 17.465f, 22f, 17f, 22f)
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
            moveTo(8.30963f, 9f)
            lineTo(7.34359f, 5.41814f)
            curveTo(7.2949f, 5.23761f, 7.27055f, 5.14734f, 7.2617f, 5.0878f)
            curveTo(7.14965f, 4.33422f, 7.86128f, 3.7186f, 8.59808f, 3.93172f)
            curveTo(8.6563f, 3.94856f, 8.74306f, 3.98483f, 8.91659f, 4.05737f)
            curveTo(8.99479f, 4.09006f, 9.0339f, 4.1064f, 9.06942f, 4.11838f)
            curveTo(9.49491f, 4.2618f, 9.96521f, 4.12143f, 10.2404f, 3.76888f)
            curveTo(10.2634f, 3.73944f, 10.287f, 3.7044f, 10.334f, 3.63432f)
            lineTo(10.5808f, 3.26686f)
            curveTo(11.0609f, 2.55204f, 11.301f, 2.19462f, 11.6056f, 2.07419f)
            curveTo(11.8558f, 1.97527f, 12.1347f, 1.97527f, 12.3849f, 2.07419f)
            curveTo(12.6896f, 2.19462f, 12.9296f, 2.55204f, 13.4098f, 3.26686f)
            lineTo(13.6626f, 3.64333f)
            curveTo(13.7181f, 3.72592f, 13.7458f, 3.76722f, 13.7735f, 3.80177f)
            curveTo(14.0398f, 4.13365f, 14.4817f, 4.27287f, 14.8921f, 4.15413f)
            curveTo(14.9348f, 4.14177f, 14.9814f, 4.12391f, 15.0747f, 4.08819f)
            curveTo(15.2819f, 4.00886f, 15.3855f, 3.96919f, 15.4563f, 3.95272f)
            curveTo(16.1721f, 3.78617f, 16.8352f, 4.38044f, 16.741f, 5.10415f)
            curveTo(16.7317f, 5.17573f, 16.7025f, 5.28206f, 16.6441f, 5.49472f)
            lineTo(15.6809f, 9f)
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
            moveTo(7f, 9f)
            curveTo(10.9052f, 9f, 13.0948f, 9f, 17f, 9f)
        }
        }.build()

        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
