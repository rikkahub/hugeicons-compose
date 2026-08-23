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

val HugeIcons.UserShield02: ImageVector
    get() {
        if (_userShield02 != null) {
            return _userShield02!!
        }
        _userShield02 = ImageVector.Builder(
            name = "UserShield02",
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
            moveTo(22f, 10.5455f)
            verticalLineTo(9.49139f)
            curveTo(22f, 9.00116f, 21.5859f, 8.61051f, 21.0885f, 8.51897f)
            curveTo(20.5628f, 8.4222f, 20.1178f, 8.2587f, 19.7974f, 8.11493f)
            curveTo(19.4559f, 7.96169f, 19.0441f, 7.96169f, 18.7026f, 8.11493f)
            curveTo(18.3822f, 8.2587f, 17.9372f, 8.4222f, 17.4115f, 8.51897f)
            curveTo(16.9141f, 8.61051f, 16.5f, 9.00116f, 16.5f, 9.49139f)
            verticalLineTo(10.5455f)
            curveTo(16.5f, 12.7572f, 18.3205f, 13.6836f, 18.999f, 13.952f)
            curveTo(19.1607f, 14.016f, 19.3393f, 14.016f, 19.501f, 13.952f)
            curveTo(20.1795f, 13.6836f, 22f, 12.7572f, 22f, 10.5455f)
            close()
        }
        }.build()

        return _userShield02!!
    }

private var _userShield02: ImageVector? = null
