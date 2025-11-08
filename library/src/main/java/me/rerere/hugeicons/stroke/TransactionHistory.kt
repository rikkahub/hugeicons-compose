package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TransactionHistory: ImageVector
    get() {
        if (_transactionHistory != null) {
            return _transactionHistory!!
        }
        _transactionHistory = ImageVector.Builder(
            name = "TransactionHistory",
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
        moveTo(19f, 10.5f)
        verticalLineTo(9.99995f)
        curveTo(19f, 6.22876f, 18.9999f, 4.34311f, 17.8284f, 3.17154f)
        curveTo(16.6568f, 2f, 14.7712f, 2f, 11f, 2f)
        curveTo(7.22889f, 2f, 5.34326f, 2.00006f, 4.17169f, 3.17159f)
        curveTo(3.00015f, 4.34315f, 3.00013f, 6.22872f, 3.0001f, 9.99988f)
        lineTo(3.00006f, 14.5f)
        curveTo(3.00003f, 17.7874f, 3.00002f, 19.4312f, 3.90794f, 20.5375f)
        curveTo(4.07418f, 20.7401f, 4.25992f, 20.9258f, 4.46249f, 21.0921f)
        curveTo(5.56883f, 22f, 7.21255f, 22f, 10.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        horizontalLineTo(15f)
        moveTo(7f, 11f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 18.5f)
        lineTo(16.5f, 17.95f)
        verticalLineTo(15.5f)
        moveTo(12f, 17.5f)
        curveTo(12f, 19.9853f, 14.0147f, 22f, 16.5f, 22f)
        curveTo(18.9853f, 22f, 21f, 19.9853f, 21f, 17.5f)
        curveTo(21f, 15.0147f, 18.9853f, 13f, 16.5f, 13f)
        curveTo(14.0147f, 13f, 12f, 15.0147f, 12f, 17.5f)
        }
        }.build()

        return _transactionHistory!!
    }

private var _transactionHistory: ImageVector? = null
