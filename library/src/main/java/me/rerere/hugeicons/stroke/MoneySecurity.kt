package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneySecurity: ImageVector
    get() {
        if (_moneySecurity != null) {
            return _moneySecurity!!
        }
        _moneySecurity = ImageVector.Builder(
            name = "MoneySecurity",
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
        moveTo(12f, 9f)
        curveTo(10.8954f, 9f, 10f, 9.67157f, 10f, 10.5f)
        curveTo(10f, 11.3284f, 10.8954f, 12f, 12f, 12f)
        curveTo(13.1046f, 12f, 14f, 12.6716f, 14f, 13.5f)
        curveTo(14f, 14.3284f, 13.1046f, 15f, 12f, 15f)
        moveTo(12f, 9f)
        curveTo(12.8708f, 9f, 13.6116f, 9.4174f, 13.8862f, 10f)
        moveTo(12f, 9f)
        verticalLineTo(8f)
        moveTo(12f, 15f)
        curveTo(11.1292f, 15f, 10.3884f, 14.5826f, 10.1138f, 14f)
        moveTo(12f, 15f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 11.1833f)
        verticalLineTo(8.28029f)
        curveTo(21f, 6.64029f, 21f, 5.82028f, 20.5959f, 5.28529f)
        curveTo(20.1918f, 4.75029f, 19.2781f, 4.49056f, 17.4507f, 3.9711f)
        curveTo(16.2022f, 3.6162f, 15.1016f, 3.18863f, 14.2223f, 2.79829f)
        curveTo(13.0234f, 2.2661f, 12.424f, 2f, 12f, 2f)
        curveTo(11.576f, 2f, 10.9766f, 2.2661f, 9.77771f, 2.79829f)
        curveTo(8.89839f, 3.18863f, 7.79784f, 3.61619f, 6.54933f, 3.9711f)
        curveTo(4.72193f, 4.49056f, 3.80822f, 4.75029f, 3.40411f, 5.28529f)
        curveTo(3f, 5.82028f, 3f, 6.64029f, 3f, 8.28029f)
        verticalLineTo(11.1833f)
        curveTo(3f, 16.8085f, 8.06277f, 20.1835f, 10.594f, 21.5194f)
        curveTo(11.2011f, 21.8398f, 11.5046f, 22f, 12f, 22f)
        curveTo(12.4954f, 22f, 12.7989f, 21.8398f, 13.406f, 21.5194f)
        curveTo(15.9372f, 20.1835f, 21f, 16.8085f, 21f, 11.1833f)
        }
        }.build()

        return _moneySecurity!!
    }

private var _moneySecurity: ImageVector? = null
