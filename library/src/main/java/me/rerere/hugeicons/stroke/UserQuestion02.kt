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

val HugeIcons.UserQuestion02: ImageVector
    get() {
        if (_userQuestion02 != null) {
            return _userQuestion02!!
        }
        _userQuestion02 = ImageVector.Builder(
            name = "UserQuestion02",
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
            moveTo(14f, 7f)
            arcTo(4f, 4f, 0f, true, false, 6f, 7f)
            arcTo(4f, 4f, 0f, true, false, 14f, 7f)
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
            moveTo(10f, 14f)
            curveTo(5f, 14f, 2f, 16.5f, 2f, 19f)
            curveTo(2f, 20.1046f, 2.89543f, 21f, 4f, 21f)
            horizontalLineTo(16f)
            curveTo(17.1046f, 21f, 18f, 20.1046f, 18f, 19f)
            curveTo(18f, 16.5f, 15f, 14f, 10f, 14f)
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
            moveTo(20.0141f, 14.4757f)
            horizontalLineTo(20.0016f)
            moveTo(18f, 9f)
            curveTo(18f, 7.89543f, 18.8954f, 7f, 20f, 7f)
            curveTo(21.1046f, 7f, 22f, 7.89543f, 22f, 9f)
            curveTo(22f, 9.75709f, 21.5793f, 10.4159f, 20.959f, 10.7555f)
            curveTo(20.4745f, 11.0207f, 20f, 11.4477f, 20f, 12f)
            moveTo(20.0266f, 14.4757f)
            curveTo(20.0266f, 14.4896f, 20.0154f, 14.5007f, 20.0016f, 14.5007f)
            curveTo(19.9878f, 14.5007f, 19.9766f, 14.4896f, 19.9766f, 14.4757f)
            curveTo(19.9766f, 14.4619f, 19.9878f, 14.4507f, 20.0016f, 14.4507f)
            curveTo(20.0154f, 14.4507f, 20.0266f, 14.4619f, 20.0266f, 14.4757f)
            close()
        }
        }.build()

        return _userQuestion02!!
    }

private var _userQuestion02: ImageVector? = null
