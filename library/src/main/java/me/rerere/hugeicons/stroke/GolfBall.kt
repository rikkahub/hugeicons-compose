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

val HugeIcons.GolfBall: ImageVector
    get() {
        if (_golfBall != null) {
            return _golfBall!!
        }
        _golfBall = ImageVector.Builder(
            name = "GolfBall",
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
            moveTo(19f, 9f)
            arcTo(7f, 7f, 0f, true, false, 5f, 9f)
            arcTo(7f, 7f, 0f, true, false, 19f, 9f)
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
            moveTo(9f, 18f)
            curveTo(10.5f, 18f, 12f, 19.4617f, 12f, 22f)
            curveTo(12f, 19.4617f, 13.5f, 18f, 15f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.125f, 7f)
            horizontalLineTo(10f)
            moveTo(10.25f, 7f)
            curveTo(10.25f, 7.13807f, 10.1381f, 7.25f, 10f, 7.25f)
            curveTo(9.86193f, 7.25f, 9.75f, 7.13807f, 9.75f, 7f)
            curveTo(9.75f, 6.86193f, 9.86193f, 6.75f, 10f, 6.75f)
            curveTo(10.1381f, 6.75f, 10.25f, 6.86193f, 10.25f, 7f)
            close()
        }
        }.build()

        return _golfBall!!
    }

private var _golfBall: ImageVector? = null
