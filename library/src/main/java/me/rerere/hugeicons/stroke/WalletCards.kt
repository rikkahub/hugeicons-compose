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

val HugeIcons.WalletCards: ImageVector
    get() {
        if (_walletCards != null) {
            return _walletCards!!
        }
        _walletCards = ImageVector.Builder(
            name = "WalletCards",
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
            moveTo(12f, 14f)
            curveTo(10.687f, 14f, 9.57106f, 13.1565f, 9.16437f, 11.9819f)
            curveTo(8.98368f, 11.46f, 8.55228f, 11f, 8f, 11f)
            curveTo(5.64298f, 11f, 4.46447f, 11f, 3.73223f, 11.7322f)
            curveTo(3f, 12.4645f, 3f, 13.643f, 3f, 16f)
            curveTo(3f, 18.357f, 3f, 19.5355f, 3.73223f, 20.2678f)
            curveTo(4.46447f, 21f, 5.64298f, 21f, 8f, 21f)
            horizontalLineTo(16f)
            curveTo(18.357f, 21f, 19.5355f, 21f, 20.2678f, 20.2678f)
            curveTo(21f, 19.5355f, 21f, 18.357f, 21f, 16f)
            curveTo(21f, 13.643f, 21f, 12.4645f, 20.2678f, 11.7322f)
            curveTo(19.5355f, 11f, 18.357f, 11f, 16f, 11f)
            curveTo(15.4477f, 11f, 15.0163f, 11.46f, 14.8356f, 11.9819f)
            curveTo(14.4289f, 13.1565f, 13.313f, 14f, 12f, 14f)
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
            moveTo(21f, 17f)
            verticalLineTo(12f)
            curveTo(21f, 9.64298f, 21f, 8.46447f, 20.2678f, 7.73223f)
            curveTo(19.5355f, 7f, 18.357f, 7f, 16f, 7f)
            horizontalLineTo(8f)
            curveTo(5.64298f, 7f, 4.46447f, 7f, 3.73223f, 7.73223f)
            curveTo(3f, 8.46447f, 3f, 9.64298f, 3f, 12f)
            verticalLineTo(17f)
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
            moveTo(21f, 13f)
            verticalLineTo(8f)
            curveTo(21f, 5.64298f, 21f, 4.46447f, 20.2678f, 3.73223f)
            curveTo(19.5355f, 3f, 18.357f, 3f, 16f, 3f)
            horizontalLineTo(8f)
            curveTo(5.64298f, 3f, 4.46447f, 3f, 3.73223f, 3.73223f)
            curveTo(3f, 4.46447f, 3f, 5.64298f, 3f, 8f)
            verticalLineTo(13f)
        }
        }.build()

        return _walletCards!!
    }

private var _walletCards: ImageVector? = null
