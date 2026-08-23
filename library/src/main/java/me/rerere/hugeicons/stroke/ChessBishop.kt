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

val HugeIcons.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = ImageVector.Builder(
            name = "ChessBishop",
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
            moveTo(14f, 4f)
            arcTo(2f, 2f, 0f, true, false, 10f, 4f)
            arcTo(2f, 2f, 0f, true, false, 14f, 4f)
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
            moveTo(15f, 18f)
            curveTo(16.5f, 17.4619f, 18f, 15.8466f, 18f, 13.6924f)
            curveTo(18f, 10.689f, 15.7781f, 7.68616f, 13.6104f, 5.5f)
            moveTo(9f, 18f)
            curveTo(7.5f, 17.4619f, 6f, 15.8466f, 6f, 13.6924f)
            curveTo(6f, 10.6896f, 8.22195f, 7.68636f, 10.3896f, 5.5f)
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
            moveTo(16f, 9f)
            lineTo(14f, 11f)
        }
        }.build()

        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
