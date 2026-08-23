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

val HugeIcons.ChessKing: ImageVector
    get() {
        if (_chessKing != null) {
            return _chessKing!!
        }
        _chessKing = ImageVector.Builder(
            name = "ChessKing",
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
            moveTo(4f, 11.5833f)
            curveTo(4f, 9.05203f, 5.68421f, 7f, 8f, 7f)
            curveTo(9.2f, 7f, 10.4f, 7.44118f, 12f, 9.20588f)
            curveTo(13.6f, 7.44118f, 14.8f, 7f, 16f, 7f)
            curveTo(18.3158f, 7f, 20f, 9.05203f, 20f, 11.5833f)
            curveTo(20f, 13.8457f, 18.4396f, 16.1415f, 16.697f, 18f)
            horizontalLineTo(7.30298f)
            curveTo(5.56044f, 16.1415f, 4f, 13.8457f, 4f, 11.5833f)
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
            moveTo(12f, 2f)
            verticalLineTo(8f)
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
            moveTo(10f, 4f)
            horizontalLineTo(14f)
        }
        }.build()

        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
