package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ElectricPlugs: ImageVector
    get() {
        if (_electricPlugs != null) {
            return _electricPlugs!!
        }
        _electricPlugs = ImageVector.Builder(
            name = "ElectricPlugs",
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
        moveTo(9f, 2f)
        lineTo(9f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 2f)
        lineTo(15f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        lineTo(12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6939f, 8.5f)
        lineTo(10.6029f, 10.6749f)
        curveTo(10.3788f, 10.9079f, 10.5394f, 11.2433f, 10.9048f, 11.3053f)
        lineTo(13.0952f, 11.6773f)
        curveTo(13.4848f, 11.7434f, 13.6334f, 12.1147f, 13.361f, 12.3413f)
        lineTo(10.7666f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3066f, 5f)
        lineTo(9.69342f, 5f)
        curveTo(7.5551f, 5f, 6.48594f, 5f, 5.89527f, 5.69774f)
        curveTo(5.3046f, 6.39548f, 5.46717f, 7.46639f, 5.79232f, 9.60823f)
        lineTo(6.31604f, 13.0581f)
        curveTo(6.83606f, 16.4836f, 8.28588f, 18f, 12f, 18f)
        curveTo(15.7141f, 18f, 17.1639f, 16.4836f, 17.684f, 13.0581f)
        lineTo(18.2077f, 9.60823f)
        curveTo(18.5328f, 7.46639f, 18.6954f, 6.39548f, 18.1047f, 5.69774f)
        curveTo(17.5141f, 5f, 16.4449f, 5f, 14.3066f, 5f)
        }
        }.build()

        return _electricPlugs!!
    }

private var _electricPlugs: ImageVector? = null
