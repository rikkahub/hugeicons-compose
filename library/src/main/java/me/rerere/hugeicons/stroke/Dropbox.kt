package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dropbox: ImageVector
    get() {
        if (_dropbox != null) {
            return _dropbox!!
        }
        _dropbox = ImageVector.Builder(
            name = "Dropbox",
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
        moveTo(12f, 6.5f)
        lineTo(17.5f, 9.5f)
        lineTo(12f, 12.5f)
        lineTo(6.5f, 9.5f)
        lineTo(12f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 15f)
        verticalLineTo(16.7993f)
        curveTo(6f, 17.8322f, 6.18419f, 18.1541f, 7.10557f, 18.6241f)
        lineTo(11.1056f, 20.6642f)
        curveTo(11.9834f, 21.1119f, 12.0166f, 21.1119f, 12.8944f, 20.6642f)
        lineTo(16.8944f, 18.6241f)
        curveTo(17.8158f, 18.1541f, 18f, 17.8322f, 18f, 16.7993f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3366f, 4.16039f)
        lineTo(12f, 6.27308f)
        lineTo(9.66338f, 4.16039f)
        curveTo(8.83959f, 3.41554f, 8.42769f, 3.04312f, 7.92383f, 3.00345f)
        curveTo(7.41998f, 2.96377f, 6.95823f, 3.26741f, 6.03473f, 3.87468f)
        lineTo(4.36211f, 4.97455f)
        curveTo(3.46519f, 5.56434f, 3.01674f, 5.85924f, 3.00045f, 6.29741f)
        curveTo(2.98417f, 6.73558f, 3.40941f, 7.06515f, 4.25991f, 7.72429f)
        lineTo(6.4348f, 9.40983f)
        lineTo(4.25991f, 11.0954f)
        curveTo(3.40942f, 11.7545f, 2.98417f, 12.0841f, 3.00045f, 12.5222f)
        curveTo(3.01674f, 12.9604f, 3.46519f, 13.2553f, 4.36211f, 13.8451f)
        lineTo(6.92973f, 15.5335f)
        curveTo(7.42226f, 15.8574f, 7.66853f, 16.0193f, 7.93725f, 15.9982f)
        curveTo(8.20597f, 15.977f, 8.42565f, 15.7784f, 8.86501f, 15.3811f)
        lineTo(12f, 12.5466f)
        lineTo(14.3366f, 14.6593f)
        curveTo(15.1604f, 15.4041f, 15.5723f, 15.7765f, 16.0762f, 15.8162f)
        curveTo(16.58f, 15.8559f, 17.0418f, 15.5522f, 17.9653f, 14.945f)
        lineTo(17.9653f, 14.945f)
        lineTo(19.6379f, 13.8451f)
        curveTo(20.5348f, 13.2553f, 20.9833f, 12.9604f, 20.9996f, 12.5222f)
        curveTo(21.0158f, 12.0841f, 20.5906f, 11.7545f, 19.7401f, 11.0954f)
        lineTo(17.5652f, 9.40983f)
        lineTo(19.7401f, 7.72429f)
        curveTo(20.5906f, 7.06515f, 21.0158f, 6.73558f, 20.9996f, 6.29741f)
        curveTo(20.9833f, 5.85924f, 20.5348f, 5.56434f, 19.6379f, 4.97455f)
        lineTo(17.9653f, 3.87468f)
        curveTo(17.0418f, 3.26741f, 16.58f, 2.96377f, 16.0762f, 3.00345f)
        curveTo(15.5723f, 3.04312f, 15.1604f, 3.41554f, 14.3366f, 4.16039f)
        }
        }.build()

        return _dropbox!!
    }

private var _dropbox: ImageVector? = null
