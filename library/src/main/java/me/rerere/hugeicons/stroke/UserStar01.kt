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

val HugeIcons.UserStar01: ImageVector
    get() {
        if (_userStar01 != null) {
            return _userStar01!!
        }
        _userStar01 = ImageVector.Builder(
            name = "UserStar01",
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
            moveTo(17.8979f, 15.0055f)
            lineTo(18.5578f, 16.2475f)
            curveTo(18.6478f, 16.4204f, 18.8878f, 16.5862f, 19.0902f, 16.618f)
            lineTo(20.2863f, 16.805f)
            curveTo(21.0513f, 16.925f, 21.2312f, 17.4472f, 20.6801f, 17.9624f)
            lineTo(19.7502f, 18.8374f)
            curveTo(19.5927f, 18.9856f, 19.5064f, 19.2715f, 19.5552f, 19.4761f)
            lineTo(19.8214f, 20.5594f)
            curveTo(20.0314f, 21.4168f, 19.5477f, 21.7485f, 18.7415f, 21.3004f)
            lineTo(17.6204f, 20.6758f)
            curveTo(17.4179f, 20.5629f, 17.0842f, 20.5629f, 16.878f, 20.6758f)
            lineTo(15.7569f, 21.3004f)
            curveTo(14.9544f, 21.7485f, 14.467f, 21.4133f, 14.677f, 20.5594f)
            lineTo(14.9432f, 19.4761f)
            curveTo(14.9919f, 19.2715f, 14.9057f, 18.9856f, 14.7482f, 18.8374f)
            lineTo(13.8183f, 17.9624f)
            curveTo(13.2709f, 17.4472f, 13.4471f, 16.925f, 14.212f, 16.805f)
            lineTo(15.4081f, 16.618f)
            curveTo(15.6069f, 16.5862f, 15.8468f, 16.4204f, 15.9368f, 16.2475f)
            lineTo(16.5968f, 15.0055f)
            curveTo(16.9567f, 14.3315f, 17.5417f, 14.3315f, 17.8979f, 15.0055f)
            close()
        }
        }.build()

        return _userStar01!!
    }

private var _userStar01: ImageVector? = null
