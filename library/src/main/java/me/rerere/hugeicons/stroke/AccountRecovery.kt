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

val HugeIcons.AccountRecovery: ImageVector
    get() {
        if (_accountRecovery != null) {
            return _accountRecovery!!
        }
        _accountRecovery = ImageVector.Builder(
            name = "AccountRecovery",
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
            moveTo(2.5f, 4f)
            verticalLineTo(5f)
            curveTo(2.5f, 6.41421f, 2.5f, 7.12132f, 2.93934f, 7.56066f)
            curveTo(3.37868f, 8f, 4.08579f, 8f, 5.5f, 8f)
            horizontalLineTo(6.5f)
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
            moveTo(2.49922f, 12.0005f)
            curveTo(2.49922f, 17.2472f, 6.75252f, 21.5005f, 11.9992f, 21.5005f)
            curveTo(17.2459f, 21.5005f, 21.4992f, 17.2472f, 21.4992f, 12.0005f)
            curveTo(21.4992f, 6.75378f, 17.2459f, 2.50049f, 11.9992f, 2.50049f)
            curveTo(8.08133f, 2.50049f, 5.04534f, 4.60026f, 3.41084f, 7.26031f)
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
            moveTo(16f, 17f)
            curveTo(15.8565f, 15.1345f, 14.3644f, 13.6576f, 12.4975f, 13.5332f)
            lineTo(12f, 13.5f)
            curveTo(11.8223f, 13.5049f, 11.6567f, 13.5113f, 11.5004f, 13.519f)
            curveTo(9.65f, 13.6097f, 8.14209f, 15.1529f, 8f, 17f)
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
            moveTo(14f, 9f)
            curveTo(14f, 10.1046f, 13.1046f, 11f, 12f, 11f)
            curveTo(10.8954f, 11f, 10f, 10.1046f, 10f, 9f)
            curveTo(10f, 7.89543f, 10.8954f, 7f, 12f, 7f)
            curveTo(13.1046f, 7f, 14f, 7.89543f, 14f, 9f)
            close()
        }
        }.build()

        return _accountRecovery!!
    }

private var _accountRecovery: ImageVector? = null
