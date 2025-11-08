package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Login01: ImageVector
    get() {
        if (_login01 != null) {
            return _login01!!
        }
        _login01 = ImageVector.Builder(
            name = "Login01",
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
        moveTo(8.00002f, 8f)
        curveTo(8.00002f, 7.42459f, 8.00002f, 7.17765f, 8.04465f, 6.92457f)
        curveTo(8.21993f, 5.93047f, 8.89355f, 5.09255f, 9.83302f, 4.70001f)
        curveTo(10.0723f, 4.60003f, 10.3559f, 4.53526f, 10.9232f, 4.40573f)
        lineTo(13.6508f, 3.78286f)
        curveTo(17.0405f, 3.00882f, 18.7353f, 2.6218f, 19.8677f, 3.51317f)
        curveTo(21f, 4.40454f, 21f, 6.1257f, 21f, 9.56803f)
        lineTo(21f, 14.432f)
        curveTo(21f, 17.8743f, 21f, 19.5955f, 19.8676f, 20.4868f)
        curveTo(18.7353f, 21.3782f, 17.0405f, 20.9912f, 13.6508f, 20.2171f)
        lineTo(10.9232f, 19.5943f)
        curveTo(10.3559f, 19.4647f, 10.0723f, 19.4f, 9.833f, 19.3f)
        curveTo(8.89353f, 18.9074f, 8.21991f, 18.0695f, 8.04462f, 17.0754f)
        curveTo(8f, 16.8224f, 8f, 16.5754f, 8f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 9f)
        curveTo(13f, 9f, 16f, 11.2095f, 16f, 12f)
        curveTo(16f, 12.7906f, 13f, 15f, 13f, 15f)
        moveTo(15.5f, 12f)
        horizontalLineTo(3f)
        }
        }.build()

        return _login01!!
    }

private var _login01: ImageVector? = null
