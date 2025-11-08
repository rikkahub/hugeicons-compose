package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = ImageVector.Builder(
            name = "Messenger",
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
        moveTo(7f, 14f)
        lineTo(8.9954f, 11.6055f)
        curveTo(9.63153f, 10.8422f, 9.9496f, 10.4605f, 10.3333f, 10.4605f)
        curveTo(10.7171f, 10.4605f, 11.0351f, 10.8422f, 11.6713f, 11.6055f)
        lineTo(12.3287f, 12.3945f)
        curveTo(12.9649f, 13.1578f, 13.2829f, 13.5395f, 13.6667f, 13.5395f)
        curveTo(14.0504f, 13.5395f, 14.3685f, 13.1578f, 15.0046f, 12.3945f)
        lineTo(17f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 13.3789f, 2.27907f, 14.6926f, 2.78382f, 15.8877f)
        curveTo(3.06278f, 16.5481f, 3.20226f, 16.8784f, 3.21953f, 17.128f)
        curveTo(3.2368f, 17.3776f, 3.16334f, 17.6521f, 3.01642f, 18.2012f)
        lineTo(2f, 22f)
        lineTo(5.79877f, 20.9836f)
        curveTo(6.34788f, 20.8367f, 6.62244f, 20.7632f, 6.87202f, 20.7805f)
        curveTo(7.12161f, 20.7977f, 7.45185f, 20.9372f, 8.11235f, 21.2162f)
        curveTo(9.30745f, 21.7209f, 10.6211f, 22f, 12f, 22f)
        }
        }.build()

        return _messenger!!
    }

private var _messenger: ImageVector? = null
