package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SendingOrder: ImageVector
    get() {
        if (_sendingOrder != null) {
            return _sendingOrder!!
        }
        _sendingOrder = ImageVector.Builder(
            name = "SendingOrder",
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
        moveTo(12f, 18f)
        curveTo(9.3161f, 18f, 6.86556f, 18.3776f, 5f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 13f)
        curveTo(20.2091f, 13f, 22f, 11.2091f, 22f, 9f)
        curveTo(22f, 6.79086f, 20.2091f, 5f, 18f, 5f)
        curveTo(17.1767f, 5f, 16.4115f, 5.24874f, 15.7754f, 5.67518f)
        curveTo(15.2287f, 4.11714f, 13.7448f, 3f, 12f, 3f)
        curveTo(10.2552f, 3f, 8.77132f, 4.11714f, 8.22461f, 5.67518f)
        curveTo(7.58854f, 5.24874f, 6.82332f, 5f, 6f, 5f)
        curveTo(3.79086f, 5f, 2f, 6.79086f, 2f, 9f)
        curveTo(2f, 11.2091f, 3.79086f, 13f, 6f, 13f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 18.5f)
        lineTo(15f, 18.5f)
        moveTo(21f, 18.5f)
        curveTo(21f, 19.2002f, 19.0057f, 20.5085f, 18.5f, 21f)
        moveTo(21f, 18.5f)
        curveTo(21f, 17.7998f, 19.0057f, 16.4915f, 18.5f, 16f)
        }
        }.build()

        return _sendingOrder!!
    }

private var _sendingOrder: ImageVector? = null
