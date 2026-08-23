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

val HugeIcons.UserTime02: ImageVector
    get() {
        if (_userTime02 != null) {
            return _userTime02!!
        }
        _userTime02 = ImageVector.Builder(
            name = "UserTime02",
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
            moveTo(14.5f, 6f)
            arcTo(4f, 4f, 0f, true, false, 6.5f, 6f)
            arcTo(4f, 4f, 0f, true, false, 14.5f, 6f)
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
            moveTo(10.5f, 13f)
            curveTo(5.5f, 13f, 2.5f, 15.5f, 2.5f, 18f)
            curveTo(2.5f, 19.1046f, 3.39543f, 20f, 4.5f, 20f)
            horizontalLineTo(9.5f)
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
            moveTo(18.5f, 18f)
            lineTo(17f, 17.5f)
            verticalLineTo(15.5f)
            moveTo(21.5f, 17.5f)
            curveTo(21.5f, 19.9853f, 19.4853f, 22f, 17f, 22f)
            curveTo(14.5147f, 22f, 12.5f, 19.9853f, 12.5f, 17.5f)
            curveTo(12.5f, 15.0147f, 14.5147f, 13f, 17f, 13f)
            curveTo(19.4853f, 13f, 21.5f, 15.0147f, 21.5f, 17.5f)
            close()
        }
        }.build()

        return _userTime02!!
    }

private var _userTime02: ImageVector? = null
