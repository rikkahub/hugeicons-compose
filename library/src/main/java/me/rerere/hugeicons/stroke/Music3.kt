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

val HugeIcons.Music3: ImageVector
    get() {
        if (_music3 != null) {
            return _music3!!
        }
        _music3 = ImageVector.Builder(
            name = "Music3",
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
            moveTo(21f, 16f)
            arcTo(3f, 3f, 0f, true, false, 15f, 16f)
            arcTo(3f, 3f, 0f, true, false, 21f, 16f)
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
            arcTo(3f, 3f, 0f, true, false, 3f, 18f)
            arcTo(3f, 3f, 0f, true, false, 9f, 18f)
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
            verticalLineTo(9.92707f)
            curveTo(9f, 7.74065f, 9f, 6.64744f, 9.6f, 5.84015f)
            curveTo(10.2f, 5.03285f, 11.24f, 4.72675f, 13.32f, 4.11456f)
            curveTo(16.84f, 3.07853f, 18.6f, 2.56052f, 19.8f, 3.46872f)
            curveTo(21f, 4.37693f, 21f, 6.22697f, 21f, 9.92707f)
            verticalLineTo(16f)
        }
        }.build()

        return _music3!!
    }

private var _music3: ImageVector? = null
