package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GlobalEducation: ImageVector
    get() {
        if (_globalEducation != null) {
            return _globalEducation!!
        }
        _globalEducation = ImageVector.Builder(
            name = "GlobalEducation",
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
        moveTo(4.49843f, 5.00004f)
        curveTo(3.19503f, 4.97812f, 2.56968f, 5.23496f, 2.22294f, 6.14258f)
        curveTo(2.01241f, 6.69367f, 2f, 7.29677f, 2f, 7.88676f)
        verticalLineTo(18f)
        curveTo(2.10783f, 18.6348f, 2.28792f, 19.0559f, 2.74232f, 19.4001f)
        curveTo(3.48302f, 19.9611f, 4.46716f, 20.0378f, 5.38129f, 20.2033f)
        curveTo(7.3857f, 20.5663f, 9.12918f, 21.1811f, 11.9937f, 22f)
        moveTo(19.489f, 5.00004f)
        curveTo(20.0658f, 4.95075f, 20.4998f, 4.97733f, 20.8427f, 5.13087f)
        curveTo(22.2148f, 5.74518f, 21.9874f, 7.76209f, 21.9874f, 9.26623f)
        verticalLineTo(17f)
        curveTo(21.9944f, 17.5973f, 21.9559f, 18.0619f, 21.8719f, 18.4323f)
        curveTo(21.5518f, 19.8431f, 19.7432f, 20.0199f, 18.3213f, 20.2822f)
        curveTo(16.5435f, 20.6101f, 14.6465f, 21.1794f, 11.9937f, 22f)
        moveTo(11.9937f, 22f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9929f, 12f)
        curveTo(14.7526f, 12f, 16.9898f, 9.76142f, 16.9898f, 7f)
        curveTo(16.9898f, 4.23858f, 14.7526f, 2f, 11.9929f, 2f)
        moveTo(11.9929f, 12f)
        curveTo(9.23326f, 12f, 6.99609f, 9.76142f, 6.99609f, 7f)
        curveTo(6.99609f, 4.23858f, 9.23326f, 2f, 11.9929f, 2f)
        moveTo(11.9929f, 12f)
        curveTo(13.0969f, 12f, 13.9917f, 9.76142f, 13.9917f, 7f)
        curveTo(13.9917f, 4.23858f, 13.0969f, 2f, 11.9929f, 2f)
        moveTo(11.9929f, 12f)
        curveTo(10.889f, 12f, 9.99421f, 9.76142f, 9.99421f, 7f)
        curveTo(9.99421f, 4.23858f, 10.889f, 2f, 11.9929f, 2f)
        }
        }.build()

        return _globalEducation!!
    }

private var _globalEducation: ImageVector? = null
