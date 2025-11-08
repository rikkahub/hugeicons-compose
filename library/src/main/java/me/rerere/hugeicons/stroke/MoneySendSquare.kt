package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneySendSquare: ImageVector
    get() {
        if (_moneySendSquare != null) {
            return _moneySendSquare!!
        }
        _moneySendSquare = ImageVector.Builder(
            name = "MoneySendSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.002f, 9.00146f)
        curveTo(10.8974f, 9.00146f, 10.002f, 9.67303f, 10.002f, 10.5015f)
        curveTo(10.002f, 11.3299f, 10.8974f, 12.0015f, 12.002f, 12.0015f)
        curveTo(13.1065f, 12.0015f, 14.002f, 12.6731f, 14.002f, 13.5015f)
        curveTo(14.002f, 14.3299f, 13.1065f, 15.0015f, 12.002f, 15.0015f)
        moveTo(12.002f, 9.00146f)
        curveTo(12.8728f, 9.00146f, 13.6136f, 9.41886f, 13.8881f, 10.0015f)
        moveTo(12.002f, 9.00146f)
        verticalLineTo(8.00146f)
        moveTo(12.002f, 15.0015f)
        curveTo(11.1311f, 15.0015f, 10.3903f, 14.5841f, 10.1158f, 14.0015f)
        moveTo(12.002f, 15.0015f)
        verticalLineTo(16.0015f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 2.50146f)
        curveTo(13.5f, 2.50146f, 12.6839f, 2.50146f, 12f, 2.50146f)
        curveTo(7.52166f, 2.50146f, 5.28249f, 2.50146f, 3.89124f, 3.89271f)
        curveTo(2.5f, 5.28395f, 2.5f, 7.52312f, 2.5f, 12.0015f)
        curveTo(2.5f, 16.4798f, 2.5f, 18.719f, 3.89124f, 20.1103f)
        curveTo(5.28249f, 21.5015f, 7.52166f, 21.5015f, 12f, 21.5015f)
        curveTo(16.4783f, 21.5015f, 18.7175f, 21.5015f, 20.1088f, 20.1103f)
        curveTo(21.5f, 18.719f, 21.5f, 16.4798f, 21.5f, 12.0015f)
        curveTo(21.5f, 11.3176f, 21.5f, 10.5015f, 21.5f, 10.5015f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 7.49927f)
        lineTo(20.6758f, 3.32107f)
        moveTo(21.5f, 6.97751f)
        lineTo(21.3818f, 3.88602f)
        curveTo(21.3818f, 3.15737f, 20.9467f, 2.70339f, 20.1542f, 2.64612f)
        lineTo(17.0302f, 2.49927f)
        }
        }.build()

        return _moneySendSquare!!
    }

private var _moneySendSquare: ImageVector? = null
