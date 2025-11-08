package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingRight04: ImageVector
    get() {
        if (_handPointingRight04 != null) {
            return _handPointingRight04!!
        }
        _handPointingRight04 = ImageVector.Builder(
            name = "HandPointingRight04",
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
        moveTo(13.485f, 10.7553f)
        lineTo(16.4892f, 10.7553f)
        moveTo(16.4892f, 10.7553f)
        horizontalLineTo(19.9954f)
        curveTo(20.8264f, 10.7553f, 21.5f, 10.083f, 21.5f, 9.25355f)
        curveTo(21.5f, 8.42415f, 20.8264f, 7.75178f, 19.9954f, 7.75178f)
        lineTo(14.531f, 7.75178f)
        moveTo(16.4892f, 10.7553f)
        lineTo(16.4624f, 11.8097f)
        curveTo(16.4443f, 12.5207f, 16.056f, 13.1373f, 15.4844f, 13.4776f)
        moveTo(14.531f, 7.75178f)
        lineTo(9.96807f, 7.75178f)
        moveTo(14.531f, 7.75178f)
        lineTo(11.7712f, 5.15834f)
        curveTo(9.90362f, 3.58588f, 8.54219f, 4.4122f, 7.78577f, 4.99245f)
        lineTo(5.34841f, 6.60732f)
        curveTo(3.28085f, 7.83214f, 2.5f, 9.2495f, 2.5f, 10.4418f)
        verticalLineTo(15.3225f)
        curveTo(2.5f, 17.5886f, 4.88227f, 19.7016f, 7.06579f, 19.7016f)
        lineTo(12.2657f, 19.7497f)
        curveTo(13.2759f, 19.759f, 14.135f, 19.0163f, 14.27f, 18.017f)
        lineTo(14.4593f, 16.4766f)
        moveTo(13.4552f, 13.7589f)
        horizontalLineTo(14.4593f)
        curveTo(14.8335f, 13.7589f, 15.1842f, 13.6563f, 15.4844f, 13.4776f)
        moveTo(15.4844f, 13.4776f)
        lineTo(15.4297f, 14.8132f)
        curveTo(15.4021f, 15.8977f, 14.5134f, 16.7624f, 13.4266f, 16.7624f)
        horizontalLineTo(12.4226f)
        }
        }.build()

        return _handPointingRight04!!
    }

private var _handPointingRight04: ImageVector? = null
