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

val HugeIcons.BowlingBall: ImageVector
    get() {
        if (_bowlingBall != null) {
            return _bowlingBall!!
        }
        _bowlingBall = ImageVector.Builder(
            name = "BowlingBall",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.125f, 9f)
            horizontalLineTo(18f)
            moveTo(18.25f, 9f)
            curveTo(18.25f, 9.13807f, 18.1381f, 9.25f, 18f, 9.25f)
            curveTo(17.8619f, 9.25f, 17.75f, 9.13807f, 17.75f, 9f)
            curveTo(17.75f, 8.86193f, 17.8619f, 8.75f, 18f, 8.75f)
            curveTo(18.1381f, 8.75f, 18.25f, 8.86193f, 18.25f, 9f)
            close()
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
            moveTo(15.125f, 6f)
            horizontalLineTo(15f)
            moveTo(15.25f, 6f)
            curveTo(15.25f, 6.13807f, 15.1381f, 6.25f, 15f, 6.25f)
            curveTo(14.8619f, 6.25f, 14.75f, 6.13807f, 14.75f, 6f)
            curveTo(14.75f, 5.86193f, 14.8619f, 5.75f, 15f, 5.75f)
            curveTo(15.1381f, 5.75f, 15.25f, 5.86193f, 15.25f, 6f)
            close()
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
            moveTo(14.125f, 10f)
            horizontalLineTo(14f)
            moveTo(14.25f, 10f)
            curveTo(14.25f, 10.1381f, 14.1381f, 10.25f, 14f, 10.25f)
            curveTo(13.8619f, 10.25f, 13.75f, 10.1381f, 13.75f, 10f)
            curveTo(13.75f, 9.86193f, 13.8619f, 9.75f, 14f, 9.75f)
            curveTo(14.1381f, 9.75f, 14.25f, 9.86193f, 14.25f, 10f)
            close()
        }
        }.build()

        return _bowlingBall!!
    }

private var _bowlingBall: ImageVector? = null
