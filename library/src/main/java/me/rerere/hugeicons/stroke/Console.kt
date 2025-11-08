package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Console: ImageVector
    get() {
        if (_console != null) {
            return _console!!
        }
        _console = ImageVector.Builder(
            name = "Console",
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
        moveTo(20.6092f, 18.1054f)
        curveTo(21.4521f, 17.4918f, 22f, 16.4974f, 22f, 15.375f)
        curveTo(22f, 13.511f, 20.489f, 12f, 18.625f, 12f)
        horizontalLineTo(18.375f)
        curveTo(16.511f, 12f, 15f, 13.511f, 15f, 15.375f)
        curveTo(15f, 16.4974f, 15.5479f, 17.4918f, 16.3908f, 18.1054f)
        moveTo(20.6092f, 18.1054f)
        curveTo(20.0523f, 18.5108f, 19.3666f, 18.75f, 18.625f, 18.75f)
        horizontalLineTo(18.375f)
        curveTo(17.6334f, 18.75f, 16.9477f, 18.5108f, 16.3908f, 18.1054f)
        moveTo(20.6092f, 18.1054f)
        lineTo(21.192f, 19.9404f)
        curveTo(21.4143f, 20.6403f, 21.5255f, 20.9903f, 21.4951f, 21.2082f)
        curveTo(21.4318f, 21.6617f, 21.0619f, 21.9984f, 20.6252f, 22f)
        curveTo(20.4154f, 22.0008f, 20.101f, 21.8358f, 19.4723f, 21.5059f)
        curveTo(19.2027f, 21.3644f, 19.0679f, 21.2936f, 18.93f, 21.252f)
        curveTo(18.649f, 21.1673f, 18.351f, 21.1673f, 18.07f, 21.252f)
        curveTo(17.9321f, 21.2936f, 17.7973f, 21.3644f, 17.5277f, 21.5059f)
        curveTo(16.899f, 21.8358f, 16.5846f, 22.0008f, 16.3748f, 22f)
        curveTo(15.9381f, 21.9984f, 15.5682f, 21.6617f, 15.5049f, 21.2082f)
        curveTo(15.4745f, 20.9903f, 15.5857f, 20.6403f, 15.808f, 19.9404f)
        lineTo(16.3908f, 18.1054f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 11f)
        curveTo(13f, 12.1046f, 12.1046f, 13f, 11f, 13f)
        curveTo(9.89543f, 13f, 9f, 12.1046f, 9f, 11f)
        curveTo(9f, 9.89543f, 9.89543f, 9f, 11f, 9f)
        curveTo(12.1046f, 9f, 13f, 9.89543f, 13f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 9.13119f)
        curveTo(19.1303f, 5.05749f, 15.4752f, 2f, 11.0982f, 2f)
        curveTo(6.0734f, 2f, 2f, 6.02944f, 2f, 11f)
        curveTo(2f, 15.9706f, 6.0734f, 20f, 11.0982f, 20f)
        curveTo(11.5749f, 20f, 12.0431f, 19.9637f, 12.5f, 19.8938f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.3633f, 4.63574f)
        lineTo(15.242f, 6.75706f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.75781f, 15.2422f)
        lineTo(4.63649f, 17.3635f)
        }
        }.build()

        return _console!!
    }

private var _console: ImageVector? = null
