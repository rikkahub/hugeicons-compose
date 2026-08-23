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

val HugeIcons.UserLove01: ImageVector
    get() {
        if (_userLove01 != null) {
            return _userLove01!!
        }
        _userLove01 = ImageVector.Builder(
            name = "UserLove01",
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
            moveTo(11.995f, 13.5663f)
            lineTo(11f, 13.5f)
            curveTo(10.6446f, 13.5097f, 10.3134f, 13.5226f, 10.0008f, 13.5379f)
            curveTo(6.3f, 13.7193f, 3.28417f, 16.8058f, 3f, 20.5002f)
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
            moveTo(15f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 7f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 15f, 6.5f)
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
            moveTo(16.9437f, 21.3121f)
            curveTo(15.9563f, 20.5675f, 14f, 18.8652f, 14f, 17.3333f)
            curveTo(14f, 16.3208f, 14.7368f, 15.5f, 15.75f, 15.5f)
            curveTo(16.275f, 15.5f, 16.8f, 15.6765f, 17.5f, 16.3823f)
            curveTo(18.2f, 15.6765f, 18.725f, 15.5f, 19.25f, 15.5f)
            curveTo(20.2632f, 15.5f, 21f, 16.3208f, 21f, 17.3333f)
            curveTo(21f, 18.8652f, 19.0437f, 20.5675f, 18.0563f, 21.3121f)
            curveTo(17.724f, 21.5626f, 17.276f, 21.5626f, 16.9437f, 21.3121f)
            close()
        }
        }.build()

        return _userLove01!!
    }

private var _userLove01: ImageVector? = null
