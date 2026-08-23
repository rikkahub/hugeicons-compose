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

val HugeIcons.Discord: ImageVector
    get() {
        if (_discord != null) {
            return _discord!!
        }
        _discord = ImageVector.Builder(
            name = "Discord",
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
            moveTo(15.5f, 17.5f)
            curveTo(16.5f, 19f, 17.3333f, 19.6667f, 18f, 20f)
            curveTo(19.3333f, 19.6667f, 22f, 18.2f, 22f, 15f)
            curveTo(22f, 11.8f, 20.6667f, 7.33333f, 20f, 5.5f)
            curveTo(18f, 4.3f, 15.8333f, 4f, 15f, 4f)
            lineTo(14.198f, 5.60393f)
            curveTo(13.4135f, 5.28708f, 12.4058f, 5.25438f, 12f, 5.27763f)
            curveTo(11.5942f, 5.25438f, 10.5865f, 5.28708f, 9.80197f, 5.60393f)
            lineTo(9f, 4f)
            curveTo(8.16667f, 4f, 6f, 4.3f, 4f, 5.5f)
            curveTo(3.33333f, 7.33333f, 2f, 11.8f, 2f, 15f)
            curveTo(2f, 18.2f, 4.66667f, 19.6667f, 6f, 20f)
            curveTo(6.66667f, 19.6667f, 7.5f, 19f, 8.5f, 17.5f)
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
            moveTo(17.3652f, 11.5f)
            curveTo(17.3652f, 12.6046f, 16.5817f, 13.5f, 15.6152f, 13.5f)
            curveTo(14.6487f, 13.5f, 13.8652f, 12.6046f, 13.8652f, 11.5f)
            curveTo(13.8652f, 10.3954f, 14.6487f, 9.5f, 15.6152f, 9.5f)
            curveTo(16.5817f, 9.5f, 17.3652f, 10.3954f, 17.3652f, 11.5f)
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
            moveTo(10f, 11.5f)
            curveTo(10f, 12.6046f, 9.2165f, 13.5f, 8.25f, 13.5f)
            curveTo(7.2835f, 13.5f, 6.5f, 12.6046f, 6.5f, 11.5f)
            curveTo(6.5f, 10.3954f, 7.2835f, 9.5f, 8.25f, 9.5f)
            curveTo(9.2165f, 9.5f, 10f, 10.3954f, 10f, 11.5f)
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
            moveTo(17.5f, 16.5f)
            curveTo(16.4022f, 17.3967f, 14.3502f, 18f, 12f, 18f)
            curveTo(9.64981f, 18f, 7.59785f, 17.3967f, 6.5f, 16.5f)
        }
        }.build()

        return _discord!!
    }

private var _discord: ImageVector? = null
