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

val HugeIcons.UserQuestion01: ImageVector
    get() {
        if (_userQuestion01 != null) {
            return _userQuestion01!!
        }
        _userQuestion01 = ImageVector.Builder(
            name = "UserQuestion01",
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
            moveTo(2.5f, 20.4998f)
            curveTo(2.78417f, 16.8055f, 5.8f, 13.719f, 9.50082f, 13.5376f)
            curveTo(9.81335f, 13.5222f, 10.1446f, 13.5094f, 10.5f, 13.4996f)
            lineTo(11.495f, 13.566f)
            curveTo(11.8368f, 13.5888f, 12.1723f, 13.6342f, 12.5f, 13.7008f)
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
            moveTo(14.5f, 6.49963f)
            arcTo(4f, 4f, 0f, true, false, 6.5f, 6.49963f)
            arcTo(4f, 4f, 0f, true, false, 14.5f, 6.49963f)
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
            moveTo(17.5141f, 21.4754f)
            horizontalLineTo(17.5016f)
            moveTo(15.5f, 15.9996f)
            curveTo(15.5f, 14.8951f, 16.3954f, 13.9996f, 17.5f, 13.9996f)
            curveTo(18.6046f, 13.9996f, 19.5f, 14.8951f, 19.5f, 15.9996f)
            curveTo(19.5f, 16.7567f, 19.0793f, 17.4156f, 18.459f, 17.7552f)
            curveTo(17.9745f, 18.0204f, 17.5f, 18.4473f, 17.5f, 18.9996f)
            moveTo(17.5266f, 21.4754f)
            curveTo(17.5266f, 21.4892f, 17.5154f, 21.5004f, 17.5016f, 21.5004f)
            curveTo(17.4878f, 21.5004f, 17.4766f, 21.4892f, 17.4766f, 21.4754f)
            curveTo(17.4766f, 21.4616f, 17.4878f, 21.4504f, 17.5016f, 21.4504f)
            curveTo(17.5154f, 21.4504f, 17.5266f, 21.4616f, 17.5266f, 21.4754f)
            close()
        }
        }.build()

        return _userQuestion01!!
    }

private var _userQuestion01: ImageVector? = null
