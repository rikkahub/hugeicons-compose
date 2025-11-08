package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneyReceiveSquare: ImageVector
    get() {
        if (_moneyReceiveSquare != null) {
            return _moneyReceiveSquare!!
        }
        _moneyReceiveSquare = ImageVector.Builder(
            name = "MoneyReceiveSquare",
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
        moveTo(12.002f, 9.00708f)
        curveTo(10.8974f, 9.00708f, 10.002f, 9.67865f, 10.002f, 10.5071f)
        curveTo(10.002f, 11.3355f, 10.8974f, 12.0071f, 12.002f, 12.0071f)
        curveTo(13.1065f, 12.0071f, 14.002f, 12.6787f, 14.002f, 13.5071f)
        curveTo(14.002f, 14.3355f, 13.1065f, 15.0071f, 12.002f, 15.0071f)
        moveTo(12.002f, 9.00708f)
        curveTo(12.8728f, 9.00708f, 13.6136f, 9.42448f, 13.8881f, 10.0071f)
        moveTo(12.002f, 9.00708f)
        verticalLineTo(8.00708f)
        moveTo(12.002f, 15.0071f)
        curveTo(11.1311f, 15.0071f, 10.3903f, 14.5897f, 10.1158f, 14.0071f)
        moveTo(12.002f, 15.0071f)
        verticalLineTo(16.0071f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 2.50708f)
        curveTo(13f, 2.50708f, 12.6839f, 2.50708f, 12f, 2.50708f)
        curveTo(7.52166f, 2.50708f, 5.28249f, 2.50708f, 3.89124f, 3.89833f)
        curveTo(2.5f, 5.28957f, 2.5f, 7.52874f, 2.5f, 12.0071f)
        curveTo(2.5f, 16.4854f, 2.5f, 18.7246f, 3.89124f, 20.1159f)
        curveTo(5.28249f, 21.5071f, 7.52166f, 21.5071f, 12f, 21.5071f)
        curveTo(16.4783f, 21.5071f, 18.7175f, 21.5071f, 20.1088f, 20.1159f)
        curveTo(21.5f, 18.7246f, 21.5f, 16.4854f, 21.5f, 12.0071f)
        curveTo(21.5f, 11.3232f, 21.5f, 11.0071f, 21.5f, 11.0071f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.4883f, 2.49292f)
        lineTo(17.3125f, 6.67112f)
        moveTo(16.4883f, 3.01468f)
        lineTo(16.6065f, 6.10617f)
        curveTo(16.6065f, 6.83481f, 17.0416f, 7.2888f, 17.8341f, 7.34606f)
        lineTo(20.9581f, 7.49292f)
        }
        }.build()

        return _moneyReceiveSquare!!
    }

private var _moneyReceiveSquare: ImageVector? = null
